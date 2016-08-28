package yelp;

import json.JSONObject;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.exception.ExceptionContext;

import java.math.BigInteger;
import java.net.*;
import java.io.*;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by albertzhang on 8/28/16.
 */
public class YelpRequest {

    private static String consumerKey = "I2_iiCfiss0ZPACujmeH0A";
    private static String consumerSecret = "bzj2XAJkPBckTpgj0oP3T3_TOow";
    private static String token = "km8Kw9wg5WSAzmQizP4-kFvUrj0UFUtO";
    private static String tokenSecret = "p5FHySnRvk4-vX0-PBd8Uv_01rg";

    public static JSONObject getYelpJson(String term, String location) {
        if (location == null) location = "Great Neck, NY";
        try {
            term = URLEncoder.encode(term, "UTF-8");
            location = URLEncoder.encode(location, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Couldn't encode terms");
            e.printStackTrace();
            return null;
        }

        String url = String.format("https://api.yelp.com/v2/search?location=%s", location);
        return new JSONObject(getRawJson(url, term));
    }

    private static String getRawJson(String urlPath, String term) {
        String parameters = "";
        parameters += "&oauth_consumer_key=" + consumerKey;
        SecureRandom random = new SecureRandom();
        parameters += "&oauth_nonce=" + new BigInteger(130, random).toString(32);
        parameters += "&oauth_signature_method=" + "HMAC-SHA1";
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        long secondsSinceEpoch = calendar.getTimeInMillis() / 1000L;
        parameters += "&oauth_timestamp=" + Integer.toString((int)secondsSinceEpoch);
        parameters += "&oauth_token=" + token;
        try {
            parameters += "&oauth_signature=" + HmacSha1Signature.calculateRFC2104HMAC(consumerSecret, consumerKey);
        } catch (InvalidKeyException e) {
            System.out.println("Invalid key");
            return null;
        } catch (NoSuchAlgorithmException e) {
            System.out.println("No such algorithm");
            return null;
        } catch (SignatureException e) {
            System.out.println("Signature exception");
            return null;
        }
        parameters += "&term=" + term;

        urlPath += parameters;

        URL url;
        try {
            url = new URL(urlPath);
        } catch (MalformedURLException e) {
            System.out.println("Couldn't make url");
            e.printStackTrace();
            return null;
        }

        HttpURLConnection connection;
        try {
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            System.out.println("Couldn't get url connection");
            e.printStackTrace();
            return null;
        }

        connection.setDoOutput(true);

        try {
            connection.setRequestMethod("GET");
        } catch (ProtocolException e) {
            System.out.println("Protocol exception");
            e.printStackTrace();
            connection.disconnect();
            return null;
        }

        try {
            InputStream inputStream = connection.getInputStream();
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = inputReader.readLine()) != null) {
                response.append(line);
                response.append('\n');
            }
            inputReader.close();
            connection.disconnect();
            return response.toString();
        } catch (IOException e) {
            System.out.println("IO Exception sadf");
            InputStream inputStream = connection.getErrorStream();
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder response = new StringBuilder();
            String line;
            try {
                while ((line = inputReader.readLine()) != null) {
                    response.append(line);
                    response.append('\n');
                }
                inputReader.close();
            } catch (IOException ie) {
                System.out.println("IO exception");
                ie.printStackTrace();
                connection.disconnect();
                return null;
            }
            System.out.println(response.toString());
            e.printStackTrace();
            connection.disconnect();
            return null;
        }

    }

}

class HmacSha1Signature {
    private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";

    private static String toHexString(byte[] bytes) {
        Formatter formatter = new Formatter();

        for (byte b : bytes) {
            formatter.format("%02x", b);
        }

        return formatter.toString();
    }

    static String calculateRFC2104HMAC(String data, String key)
            throws SignatureException, NoSuchAlgorithmException, InvalidKeyException
    {
        SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), HMAC_SHA1_ALGORITHM);
        Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
        mac.init(signingKey);
        return toHexString(mac.doFinal(data.getBytes()));
    }
}