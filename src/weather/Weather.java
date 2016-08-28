package weather;

import json.JSONArray;
import json.JSONObject;

/**
 * Created by Yuhan on 8/28/16.
 */

import java.util.*;
public class Weather {

    private ArrayList<Integer> temperatureList = new ArrayList<Integer>();
    private ArrayList<Date> dateList = new ArrayList<Date>();
    private ArrayList<String> conditionList = new ArrayList<String>();
    private ArrayList<Integer> humidityList = new ArrayList<Integer>();
    private ArrayList<Integer> uviList = new ArrayList<Integer>();
    private ArrayList<Integer> feelsLikeList = new ArrayList<Integer>();
    private ArrayList<Integer> windSpeedList = new ArrayList<Integer>();
    private ArrayList<Integer> windDirList = new ArrayList<Integer>();

    public void parseWeather() {
        JSONObject jsonObject = WeatherRequest.getWeatherJSON();

        JSONArray forecasts = jsonObject.getJSONArray("hourly_forecast");
        int length = forecasts.length();


        ArrayList<Integer> temperatureList = new ArrayList<Integer>();
        ArrayList<Date> dateList = new ArrayList<Date>();
        ArrayList<String> conditionList = new ArrayList<String>();

        for (int i = 0; i < length; ++i) {
            JSONObject forecast = forecasts.getJSONObject(i);
            JSONObject time = forecast.getJSONObject("FCTTIME");
            JSONObject temp = forecast.getJSONObject("temp");
            JSONObject ws = forecast.getJSONObject("wspd");
            JSONObject wd = forecast.getJSONObject("wdir");
            JSONObject uv = forecast.getJSONObject("uvi");
            JSONObject feel = forecast.getJSONObject("feelslike");

            Integer hour = time.getInt("hour");
            Integer month = time.getInt("mon");
            Integer day = time.getInt("mday");

            Integer humidity = forecast.getInt("humidity");
            Integer windSpeed = ws.getInt("english");
            String windDirection = wd.getString("dir");
            Integer uvi = uv.getInt("uvi");
            Integer feelslike = feel.getInt("english");


            Date date = new Date(month,day,hour);
            Integer temperature = temp.getInt("english");
            String condition = forecast.getString("condition");
            temperatureList.add(temperature);
            dateList.add(date);
            conditionList.add(condition);

        }
        this.temperatureList = temperatureList;
        this.dateList = dateList;
        this.conditionList = conditionList;
    }

    public Integer getHumidity(int month, int day, int hour) {
        int index = getDateIndex(month, day, hour);
        if(index == -1) return null;

        return humidityList.get(index);
    }
    public Integer getWindSpeed(int month, int day, int hour) {
        int index = getDateIndex(month, day, hour);
        if(index == -1) return null;

        return windSpeedList.get(index);
    }
    public Integer getWindDir(int month, int day, int hour) {
        int index = getDateIndex(month, day, hour);
        if(index == -1) return null;

        return windDirList.get(index);
    }
    public Integer getuvi(int month, int day, int hour) {
        int index = getDateIndex(month, day, hour);
        if(index == -1) return null;

        return uviList.get(index);
    }

    public Integer getFeelsLike(int month, int day, int hour) {
        int index = getDateIndex(month, day, hour);
        if(index == -1) return null;

        return feelsLikeList.get(index);
    }

    public Integer getTemperatureOnDay(int month, int day, int hour) {
        int index = getDateIndex(month, day, hour);
        if(index == -1) return null;

        return temperatureList.get(index);
    }

    public String getCondition(int month, int day, int hour){
        int index = getDateIndex(month,day,hour);
        if (index == -1) return null;

        return conditionList.get(index);
    }


    public int getDateIndex(int month, int day, int hour) {
        if (month == -1 || day == -1 || hour == -1) return 0;
        Date date = new Date(month, day, hour);
        return dateList.indexOf(date);
    }

}

class Date{
    private int month;
    private int day;
    private int hour;

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public Date(int month, int day, int hour) {

        this.month = month;
        this.day = day;
        this.hour = hour;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Date) {
            Date d = (Date) obj;
            return this.day == d.day && this.month == d.month && this.hour == d.hour;

        }
        return false;
    }
}
