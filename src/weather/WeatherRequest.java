package weather;

import json.JSONObject;

import java.io.*;
import java.net.*;

/**
 * Created by Yuhan on 8/28/16.
 */
public class WeatherRequest {

    private static String apiKey = "61f22ea25360d343";

    public static JSONObject getProbabilityJSON(int month, int day) {
        String url = String.format("http://api.wunderground.com/api/61f22ea25360d343/planner_%02d%02d%02d%02d/q/NY/Great_Neck.json", month, day, month, day);
        return new JSONObject(getRawJson(url)).getJSONObject("trip").getJSONObject("chance_of");
    }

    public static JSONObject getWeatherJSON() {
        return new JSONObject(getRawJson("http://api.wunderground.com/api/61f22ea25360d343/hourly10day/q/NY/Great_Neck.json"));
    }

    public static String getRawJson(String urlPath) {
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
