package wit;

import java.io.*;
import java.net.*;
import json.*;
import java.util.*;

/**
 * Created by Yuhan on 8/28/16.
 */
public class WRequest {

    private static String apiKey = "IT273QMRQK2Q4KLXCBVYP6H7FIOE7SPQ";
    private static String version = "20160828";
    private static String baseURL = "https://api.wit.ai/message?";

    public static String getMessage(String input) {
        JSONObject jsonObject = new JSONObject(getRawJson(input));
        jsonObject = jsonObject.getJSONObject("entities");
        Set<String> keys = jsonObject.keySet();

        String requestType = "";
        if (keys.contains("weather_inquire")) {
            requestType = "Weather request\n";
        } else if (keys.contains("reminder") && keys.contains("remind")) {
            requestType += "Reminder request\n";
        }

        String modifiers = "";
        if (keys.contains("datetime")) {
            modifiers += "Date provided\n";
        }
        if (keys.contains("location")) {
            modifiers += "Location provided\n";
        }
        return "Request type: " + requestType + "\n" + "Modifiers: " + modifiers;
    }

    private static String getRawJson(String input) {
        URL url;
        try {
            url = new URL(baseURL + "v=" + version + "&q=" + URLEncoder.encode(input, "UTF-8"));
        } catch (MalformedURLException e) {
            System.out.println("Couldn't make url");
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e) {
            System.out.println("Couldn't encode input");
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

        connection.setRequestProperty("Authorization", "Bearer " + apiKey);

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
            System.out.println("IO Exception");
            e.printStackTrace();
            connection.disconnect();
            return null;
        }

    }

}
