package weather;

import json.JSONArray;
import json.JSONObject;

/**
 * Created by Yuhan on 8/28/16.
 */
public class Weather {

    public static void parseWeather() {
        JSONObject jsonObject = WeatherRequest.getWeatherJSON();

        JSONArray forecasts = jsonObject.getJSONArray("hourly_forecast");
        int length = forecasts.length();
        for (int i = 0; i < length; ++i) {
            JSONObject forecast = forecasts.getJSONObject(i);

        }
    }

}
