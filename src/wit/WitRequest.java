package wit;

import java.io.*;
import java.net.*;
import json.*;
import java.util.*;
import weather.*;

/**
 * Created by Yuhan on 8/28/16.
 */
public class WitRequest {

    private static String apiKey = "IT273QMRQK2Q4KLXCBVYP6H7FIOE7SPQ";
    private static String version = "20160828";
    private static String baseURL = "https://api.wit.ai/message?";

    public static String getMessage(String input) {
        JSONObject jsonObject = new JSONObject(getRawJson(input));
        jsonObject = jsonObject.getJSONObject("entities");
        Set<String> keys = jsonObject.keySet();

        int month = -1, day = -1, hour = -1;

        if (keys.contains("datetime")) {
            JSONObject dateObject = jsonObject.getJSONArray("datetime").getJSONObject(0);
            String value = dateObject.getString("value");
            String[] s = value.split("T");
            String[] date = s[0].split("-");
            String monthS = date[1];
            String dayS = date[2];
            String[] time = s[1].split(":");
            String hourS = time[0];

            month = Integer.parseInt(monthS);
            day = Integer.parseInt(dayS);
            hour = Integer.parseInt(hourS);
        }
        if (keys.contains("location")) {

        }

        else if (keys.contains("weather_inquire")) {
            JSONObject weatherData = jsonObject.getJSONArray("weather_inquire").getJSONObject(0);
            System.out.println(weatherData);
            Weather w = new Weather();
            w.parseWeather();
            Integer temperature = w.getTemperatureOnDay(month, day, hour);
            String condition = w.getCondition(month, day, hour);
            return "Temperature: " + temperature.toString() + ", Condition: " + condition;
        }

        return null;
//        return "http://icons-ak.wxug.com/i/c/k/clear.gif";
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
