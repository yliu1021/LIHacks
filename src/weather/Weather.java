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
            JSONObject cond = forecast.getJSONObject("condition");

            Integer hour = time.getInt("hour");
            Integer month = time.getInt("mon");
            Integer day = time.getInt("mday");
            Date date = new Date(month,day,hour);
            Integer temperature = temp.getInt("English");
            String condition = cond.getString("condition");
            temperatureList.add(temperature);
            dateList.add(date);
            conditionList.add(condition);

        }
        this.temperatureList = temperatureList;
        this.dateList = dateList;
        this.conditionList = conditionList;
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
