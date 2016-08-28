package wit;

import java.io.*;
import java.net.*;
import json.*;
import java.util.*;
import weather.*;

import static java.lang.String.*;

/**
 * Created by Yuhan on 8/28/16.
 */
public class WitRequest {

    private static String apiKey = "IT273QMRQK2Q4KLXCBVYP6H7FIOE7SPQ";
    private static String version = "20160828";
    private static String baseURL = "https://api.wit.ai/message?";

    private static int[] lastDate;

    public static String getMessage(String input) {
        if (input.startsWith("!chances")) {
            int month, day;
            if (input.startsWith("!chances ")) {
                String param = input.substring(9).replace(",", " ").replace("/", " ");
                String[] args = param.split(" ");
                if (args.length != 2) return "invalid arguments";
                month = Integer.parseInt(args[0]);
                day = Integer.parseInt(args[1]);
            } else {
                if (lastDate != null && lastDate.length == 2) {
                    month = lastDate[0];
                    day = lastDate[1];
                } else {
                    Calendar d = Calendar.getInstance();
                    month = d.get(Calendar.MONTH);
                    day = d.get(Calendar.DATE);
                }
            }
            Weather w = new Weather();
            HashMap<String, String> chances = w.chances(month, day);
            return join("\n", chances.values());
        }
        JSONObject jsonObject = new JSONObject(getRawJson(input));
        jsonObject = jsonObject.getJSONObject("entities");
        System.out.println(jsonObject.toString());
        Set<String> keys = jsonObject.keySet();

        Calendar d = Calendar.getInstance();
        int month = d.get(Calendar.MONTH);
        int day = d.get(Calendar.DATE);
        int hour = d.get(Calendar.HOUR_OF_DAY);
        String location = "";

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
            JSONObject locationObject = jsonObject.getJSONArray("location").getJSONObject(0);
            location = locationObject.getString("value");
        }

        if (keys.contains("weather_inquire")) {
            JSONObject weatherData = jsonObject.getJSONArray("weather_inquire").getJSONObject(0);
            System.out.println(weatherData);
            Weather w = new Weather();
            w.parseWeather();
            String date = w.getDate(month, day, hour);
            lastDate = new int[]{month, day};
            String temperature = w.getTemperatureOnDay(month, day, hour).toString();
            String condition = w.getCondition(month, day, hour);
            String windSpeed = w.getWindSpeed(month, day, hour).toString();
            String windDirection = w.getWindDir(month, day, hour);
            String UVIndex = w.getuvi(month, day, hour).toString();
            String humidity = w.getHumidity(month, day, hour).toString();
            String feelsLike = w.getFeelsLike(month, day, hour).toString();
            return format("%s\n%s, %s °F, feels like %s °F\nWind speed: %s mph %s\nUV Index: %s\nHumidity: %s%%",
                    date,
                    condition, temperature, feelsLike,
                    windSpeed, windDirection,
                    UVIndex,
                    humidity);
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
