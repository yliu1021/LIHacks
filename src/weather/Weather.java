package weather;

import json.JSONArray;
import json.JSONObject;
import org.apache.commons.lang3.StringEscapeUtils;

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
    private ArrayList<String> windDirList = new ArrayList<String>();

    public void parseWeather() {
        JSONObject jsonObject = WeatherRequest.getWeatherJSON();

        JSONArray forecasts = jsonObject.getJSONArray("hourly_forecast");
        int length = forecasts.length();


        ArrayList<Integer> temperatureList = new ArrayList<Integer>();
        ArrayList<Date> dateList = new ArrayList<Date>();
        ArrayList<String> conditionList = new ArrayList<String>();
        ArrayList<Integer> humidityList = new ArrayList<Integer>();
        ArrayList<Integer> uviList = new ArrayList<Integer>();
        ArrayList<Integer> feelsLikeList = new ArrayList<Integer>();
        ArrayList<Integer> windSpeedList = new ArrayList<Integer>();
        ArrayList<String> windDirList = new ArrayList<String>();

        for (int i = 0; i < length; ++i) {
            JSONObject forecast = forecasts.getJSONObject(i);
            JSONObject time = forecast.getJSONObject("FCTTIME");
            JSONObject temp = forecast.getJSONObject("temp");
            JSONObject ws = forecast.getJSONObject("wspd");
            JSONObject wd = forecast.getJSONObject("wdir");
            JSONObject feel = forecast.getJSONObject("feelslike");

            Integer hour = time.getInt("hour");
            Integer month = time.getInt("mon");
            Integer day = time.getInt("mday");

            Integer humidity = forecast.getInt("humidity");
            Integer windSpeed = ws.getInt("english");
            String windDirection = wd.getString("dir");
            Integer uvi = forecast.getInt("uvi");
            Integer feelsLike = feel.getInt("english");


            Date date = new Date(month,day,hour);
            Integer temperature = temp.getInt("english");
            String condition = forecast.getString("condition");
            temperatureList.add(temperature);
            dateList.add(date);
            conditionList.add(condition);
            humidityList.add(humidity);
            windSpeedList.add(windSpeed);
            windDirList.add(windDirection);
            uviList.add(uvi);
            feelsLikeList.add(feelsLike);
        }
        this.temperatureList = temperatureList;
        this.dateList = dateList;
        this.conditionList = conditionList;
        this.humidityList = humidityList;
        this.uviList = uviList;
        this.feelsLikeList = feelsLikeList;
        this.windSpeedList = windSpeedList;
        this.windDirList = windDirList;
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
    public String getWindDir(int month, int day, int hour) {
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

    public String getDate(int month, int day, int hour) {
        int index = getDateIndex(month, day, hour);
        if (index == -1) return null;

        Date date = dateList.get(index);
        return date.toString();
    }

    public int getDateIndex(int month, int day, int hour) {
        if (month == -1 || day == -1 || hour == -1) return 0;
        Date date = new Date(month, day, hour);
        return dateList.indexOf(date);
    }

    public HashMap<String, String> chances(int month, int day) {
        HashMap<String, String> chances = new HashMap<String, String>();
        JSONObject jsonObject = WeatherRequest.getProbabilityJSON(month, day);
        String[] categories = new String[] {"tempoversixty", "chanceofhumidday", "chanceofwindyday",
                "chanceofprecip", "chanceofrainday", "chanceofsultryday",
                "chanceofsunnycloudyday", "chanceofcloudyday", "chanceofthunderday",
                "chanceofpartlycloudyday", "chanceofsnowonground", "chanceoftornadoday",
                "tempbelowfreezing", "tempoverfreezing", "tempoverninety",
                "chanceofhailday", "chanceofsnowday", "chanceoffogday"};
        for (String category : categories) {
            JSONObject chance = jsonObject.getJSONObject(category);
            String name = chance.getString("name").toLowerCase();
            String desc = StringEscapeUtils.unescapeHtml4(chance.getString("description"));
            String percentage = chance.getString("percentage");
            String description = "Chances of " + (desc.equals("") ? name : desc) + ": " + percentage + "%";
            chances.put(category, description);
        }
        return chances;
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

    @Override
    public String toString() {
        return String.format("%d/%d @ %d:00", month, day, hour);
    }
}
