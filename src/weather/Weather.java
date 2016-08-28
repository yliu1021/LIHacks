package weather;

import json.JSONArray;
import json.JSONObject;

/**
 * Created by Yuhan on 8/28/16.
 */
public class Weather {

    public static void loadWeather() {
        JSONObject jsonObject = new JSONObject(sampleResponse);

        JSONArray forecasts = jsonObject.getJSONArray("hourly_forecast");
        int length = forecasts.length();
        for (int i = 0; i < length; ++i) {
            JSONObject forecast = forecasts.getJSONObject(i);

        }
    }

    private static String sampleResponse = "\n" +
           "{\n" +
           "  \"response\": {\n" +
           "  \"version\":\"0.1\",\n" +
           "  \"termsofService\":\"http://www.wunderground.com/weather/api/d/terms.html\",\n" +
           "  \"features\": {\n" +
           "  \"hourly10day\": 1\n" +
           "  }\n" +
           "\t}\n" +
           "\t\t,\n" +
           "\t\"hourly_forecast\": [\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"3\",\"hour_padded\": \"03\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472367600\",\"pretty\": \"3:00 AM EDT on August 28, 2016\",\"civil\": \"3:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"20\",\n" +
           "\t\t\"wspd\": {\"english\": \"2\", \"metric\": \"3\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"ESE\", \"degrees\": \"122\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"80\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.22\", \"metric\": \"1023\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"4\",\"hour_padded\": \"04\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472371200\",\"pretty\": \"4:00 AM EDT on August 28, 2016\",\"civil\": \"4:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"24\",\n" +
           "\t\t\"wspd\": {\"english\": \"2\", \"metric\": \"3\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"ESE\", \"degrees\": \"111\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"81\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.22\", \"metric\": \"1023\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"5\",\"hour_padded\": \"05\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472374800\",\"pretty\": \"5:00 AM EDT on August 28, 2016\",\"civil\": \"5:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"26\",\n" +
           "\t\t\"wspd\": {\"english\": \"2\", \"metric\": \"3\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"E\", \"degrees\": \"99\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"84\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.22\", \"metric\": \"1023\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"6\",\"hour_padded\": \"06\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472378400\",\"pretty\": \"6:00 AM EDT on August 28, 2016\",\"civil\": \"6:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"19\",\n" +
           "\t\t\"wspd\": {\"english\": \"4\", \"metric\": \"6\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"E\", \"degrees\": \"80\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"85\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"7\",\"hour_padded\": \"07\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472382000\",\"pretty\": \"7:00 AM EDT on August 28, 2016\",\"civil\": \"7:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"13\",\n" +
           "\t\t\"wspd\": {\"english\": \"4\", \"metric\": \"6\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"ENE\", \"degrees\": \"71\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"84\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.25\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"8\",\"hour_padded\": \"08\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472385600\",\"pretty\": \"8:00 AM EDT on August 28, 2016\",\"civil\": \"8:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"9\",\n" +
           "\t\t\"wspd\": {\"english\": \"4\", \"metric\": \"6\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"E\", \"degrees\": \"89\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"79\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.25\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"9\",\"hour_padded\": \"09\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472389200\",\"pretty\": \"9:00 AM EDT on August 28, 2016\",\"civil\": \"9:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"ESE\", \"degrees\": \"110\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"67\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.26\", \"metric\": \"1025\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"10\",\"hour_padded\": \"10\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472392800\",\"pretty\": \"10:00 AM EDT on August 28, 2016\",\"civil\": \"10:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"ESE\", \"degrees\": \"119\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"4\",\n" +
           "\t\t\"humidity\": \"56\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.25\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"11\",\"hour_padded\": \"11\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472396400\",\"pretty\": \"11:00 AM EDT on August 28, 2016\",\"civil\": \"11:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SE\", \"degrees\": \"138\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"6\",\n" +
           "\t\t\"humidity\": \"49\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.25\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"12\",\"hour_padded\": \"12\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472400000\",\"pretty\": \"12:00 PM EDT on August 28, 2016\",\"civil\": \"12:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"156\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"45\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"13\",\"hour_padded\": \"13\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472403600\",\"pretty\": \"1:00 PM EDT on August 28, 2016\",\"civil\": \"1:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"59\", \"metric\": \"15\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"161\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"8\",\n" +
           "\t\t\"humidity\": \"44\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.23\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"14\",\"hour_padded\": \"14\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472407200\",\"pretty\": \"2:00 PM EDT on August 28, 2016\",\"civil\": \"2:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"159\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"44\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.21\", \"metric\": \"1023\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"15\",\"hour_padded\": \"15\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472410800\",\"pretty\": \"3:00 PM EDT on August 28, 2016\",\"civil\": \"3:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"163\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"47\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.19\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"16\",\"hour_padded\": \"16\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472414400\",\"pretty\": \"4:00 PM EDT on August 28, 2016\",\"civil\": \"4:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"161\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"3\",\n" +
           "\t\t\"humidity\": \"50\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.18\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"17\",\"hour_padded\": \"17\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472418000\",\"pretty\": \"5:00 PM EDT on August 28, 2016\",\"civil\": \"5:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"157\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"54\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.17\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"18\",\"hour_padded\": \"18\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472421600\",\"pretty\": \"6:00 PM EDT on August 28, 2016\",\"civil\": \"6:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"161\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"59\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"19\",\"hour_padded\": \"19\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472425200\",\"pretty\": \"7:00 PM EDT on August 28, 2016\",\"civil\": \"7:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"162\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"65\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"20\",\"hour_padded\": \"20\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472428800\",\"pretty\": \"8:00 PM EDT on August 28, 2016\",\"civil\": \"8:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"21\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"165\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"70\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"21\",\"hour_padded\": \"21\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472432400\",\"pretty\": \"9:00 PM EDT on August 28, 2016\",\"civil\": \"9:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"167\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"71\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"22\",\"hour_padded\": \"22\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472436000\",\"pretty\": \"10:00 PM EDT on August 28, 2016\",\"civil\": \"10:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"10\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"172\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"73\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.17\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"23\",\"hour_padded\": \"23\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"28\",\"mday_padded\": \"28\",\"yday\": \"240\",\"isdst\": \"1\",\"epoch\": \"1472439600\",\"pretty\": \"11:00 PM EDT on August 28, 2016\",\"civil\": \"11:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"14\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"179\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"76\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.17\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"0\",\"hour_padded\": \"00\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472443200\",\"pretty\": \"12:00 AM EDT on August 29, 2016\",\"civil\": \"12:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"12\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"193\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"78\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"5\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.15\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"1\",\"hour_padded\": \"01\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472446800\",\"pretty\": \"1:00 AM EDT on August 29, 2016\",\"civil\": \"1:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"9\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"209\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"81\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"5\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.14\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"2\",\"hour_padded\": \"02\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472450400\",\"pretty\": \"2:00 AM EDT on August 29, 2016\",\"civil\": \"2:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"8\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"227\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"82\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.14\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"3\",\"hour_padded\": \"03\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472454000\",\"pretty\": \"3:00 AM EDT on August 29, 2016\",\"civil\": \"3:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"16\",\n" +
           "\t\t\"wspd\": {\"english\": \"4\", \"metric\": \"6\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"219\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"83\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"4\",\"hour_padded\": \"04\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472457600\",\"pretty\": \"4:00 AM EDT on August 29, 2016\",\"civil\": \"4:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"16\",\n" +
           "\t\t\"wspd\": {\"english\": \"4\", \"metric\": \"6\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"232\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"84\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"5\",\"hour_padded\": \"05\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472461200\",\"pretty\": \"5:00 AM EDT on August 29, 2016\",\"civil\": \"5:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"21\",\n" +
           "\t\t\"wspd\": {\"english\": \"4\", \"metric\": \"6\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"250\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"85\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"6\",\"hour_padded\": \"06\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472464800\",\"pretty\": \"6:00 AM EDT on August 29, 2016\",\"civil\": \"6:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"29\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"246\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"85\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"7\",\"hour_padded\": \"07\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472468400\",\"pretty\": \"7:00 AM EDT on August 29, 2016\",\"civil\": \"7:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"41\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"257\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"83\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"5\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"8\",\"hour_padded\": \"08\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472472000\",\"pretty\": \"8:00 AM EDT on August 29, 2016\",\"civil\": \"8:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"37\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"255\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"74\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"9\",\"hour_padded\": \"09\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472475600\",\"pretty\": \"9:00 AM EDT on August 29, 2016\",\"civil\": \"9:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"34\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"268\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"66\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"10\",\"hour_padded\": \"10\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472479200\",\"pretty\": \"10:00 AM EDT on August 29, 2016\",\"civil\": \"10:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"51\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"275\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"3\",\n" +
           "\t\t\"humidity\": \"58\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"11\",\"hour_padded\": \"11\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472482800\",\"pretty\": \"11:00 AM EDT on August 29, 2016\",\"civil\": \"11:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"50\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"275\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"6\",\n" +
           "\t\t\"humidity\": \"52\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.09\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"12\",\"hour_padded\": \"12\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472486400\",\"pretty\": \"12:00 PM EDT on August 29, 2016\",\"civil\": \"12:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"86\", \"metric\": \"30\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"49\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"267\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"48\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"87\", \"metric\": \"31\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"87\", \"metric\": \"31\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.07\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"13\",\"hour_padded\": \"13\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472490000\",\"pretty\": \"1:00 PM EDT on August 29, 2016\",\"civil\": \"1:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"46\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"263\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"45\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"89\", \"metric\": \"32\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"89\", \"metric\": \"32\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.05\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"14\",\"hour_padded\": \"14\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472493600\",\"pretty\": \"2:00 PM EDT on August 29, 2016\",\"civil\": \"2:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"89\", \"metric\": \"32\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"45\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"274\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"43\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"90\", \"metric\": \"32\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"90\", \"metric\": \"32\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"21\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.04\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"15\",\"hour_padded\": \"15\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472497200\",\"pretty\": \"3:00 PM EDT on August 29, 2016\",\"civil\": \"3:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"89\", \"metric\": \"32\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"22\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"267\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"42\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"90\", \"metric\": \"32\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"90\", \"metric\": \"32\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"24\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.03\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"16\",\"hour_padded\": \"16\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472500800\",\"pretty\": \"4:00 PM EDT on August 29, 2016\",\"civil\": \"4:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"89\", \"metric\": \"32\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Chance of a Thunderstorm\",\n" +
           "\t\t\"icon\": \"chancetstorms\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/chancetstorms.gif\",\n" +
           "\t\t\"fctcode\": \"14\",\n" +
           "\t\t\"sky\": \"35\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"281\"},\n" +
           "\t\t\"wx\": \"Isolated Thunderstorms\",\n" +
           "\t\t\"uvi\": \"3\",\n" +
           "\t\t\"humidity\": \"42\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"90\", \"metric\": \"32\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"90\", \"metric\": \"32\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.01\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"34\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.02\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"17\",\"hour_padded\": \"17\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472504400\",\"pretty\": \"5:00 PM EDT on August 29, 2016\",\"civil\": \"5:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"50\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WNW\", \"degrees\": \"291\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"43\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.01\", \"metric\": \"1016\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"18\",\"hour_padded\": \"18\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472508000\",\"pretty\": \"6:00 PM EDT on August 29, 2016\",\"civil\": \"6:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"87\", \"metric\": \"31\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"27\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WNW\", \"degrees\": \"294\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"45\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.01\", \"metric\": \"1016\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"19\",\"hour_padded\": \"19\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472511600\",\"pretty\": \"7:00 PM EDT on August 29, 2016\",\"civil\": \"7:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"24\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WNW\", \"degrees\": \"303\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"51\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"86\", \"metric\": \"30\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"86\", \"metric\": \"30\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.03\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"20\",\"hour_padded\": \"20\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472515200\",\"pretty\": \"8:00 PM EDT on August 29, 2016\",\"civil\": \"8:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"24\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NW\", \"degrees\": \"321\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"54\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.04\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"21\",\"hour_padded\": \"21\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472518800\",\"pretty\": \"9:00 PM EDT on August 29, 2016\",\"civil\": \"9:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"23\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"348\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"58\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.06\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"22\",\"hour_padded\": \"22\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472522400\",\"pretty\": \"10:00 PM EDT on August 29, 2016\",\"civil\": \"10:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"19\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"N\", \"degrees\": \"359\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"59\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.07\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"23\",\"hour_padded\": \"23\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"29\",\"mday_padded\": \"29\",\"yday\": \"241\",\"isdst\": \"1\",\"epoch\": \"1472526000\",\"pretty\": \"11:00 PM EDT on August 29, 2016\",\"civil\": \"11:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"14\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"N\", \"degrees\": \"1\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"61\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.08\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"0\",\"hour_padded\": \"00\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472529600\",\"pretty\": \"12:00 AM EDT on August 30, 2016\",\"civil\": \"12:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"11\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"N\", \"degrees\": \"7\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"62\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.08\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"1\",\"hour_padded\": \"01\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472533200\",\"pretty\": \"1:00 AM EDT on August 30, 2016\",\"civil\": \"1:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"N\", \"degrees\": \"7\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"63\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.08\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"2\",\"hour_padded\": \"02\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472536800\",\"pretty\": \"2:00 AM EDT on August 30, 2016\",\"civil\": \"2:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"5\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"N\", \"degrees\": \"9\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"63\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.08\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"3\",\"hour_padded\": \"03\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472540400\",\"pretty\": \"3:00 AM EDT on August 30, 2016\",\"civil\": \"3:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"4\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNE\", \"degrees\": \"14\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"65\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.09\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"4\",\"hour_padded\": \"04\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472544000\",\"pretty\": \"4:00 AM EDT on August 30, 2016\",\"civil\": \"4:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNE\", \"degrees\": \"21\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"69\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.09\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"5\",\"hour_padded\": \"05\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472547600\",\"pretty\": \"5:00 AM EDT on August 30, 2016\",\"civil\": \"5:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNE\", \"degrees\": \"24\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"73\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"6\",\"hour_padded\": \"06\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472551200\",\"pretty\": \"6:00 AM EDT on August 30, 2016\",\"civil\": \"6:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNE\", \"degrees\": \"23\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"75\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"7\",\"hour_padded\": \"07\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472554800\",\"pretty\": \"7:00 AM EDT on August 30, 2016\",\"civil\": \"7:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"69\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNE\", \"degrees\": \"26\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"76\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"69\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"8\",\"hour_padded\": \"08\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472558400\",\"pretty\": \"8:00 AM EDT on August 30, 2016\",\"civil\": \"8:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNE\", \"degrees\": \"29\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"71\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"9\",\"hour_padded\": \"09\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472562000\",\"pretty\": \"9:00 AM EDT on August 30, 2016\",\"civil\": \"9:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NE\", \"degrees\": \"37\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"64\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"10\",\"hour_padded\": \"10\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472565600\",\"pretty\": \"10:00 AM EDT on August 30, 2016\",\"civil\": \"10:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"5\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NE\", \"degrees\": \"38\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"4\",\n" +
           "\t\t\"humidity\": \"57\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"11\",\"hour_padded\": \"11\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472569200\",\"pretty\": \"11:00 AM EDT on August 30, 2016\",\"civil\": \"11:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"8\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NE\", \"degrees\": \"51\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"52\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"12\",\"hour_padded\": \"12\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472572800\",\"pretty\": \"12:00 PM EDT on August 30, 2016\",\"civil\": \"12:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"E\", \"degrees\": \"88\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"49\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"13\",\"hour_padded\": \"13\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472576400\",\"pretty\": \"1:00 PM EDT on August 30, 2016\",\"civil\": \"1:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"151\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"47\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.09\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"14\",\"hour_padded\": \"14\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472580000\",\"pretty\": \"2:00 PM EDT on August 30, 2016\",\"civil\": \"2:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SE\", \"degrees\": \"143\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"47\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.07\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"15\",\"hour_padded\": \"15\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472583600\",\"pretty\": \"3:00 PM EDT on August 30, 2016\",\"civil\": \"3:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"159\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"47\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.05\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"16\",\"hour_padded\": \"16\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472587200\",\"pretty\": \"4:00 PM EDT on August 30, 2016\",\"civil\": \"4:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"164\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"3\",\n" +
           "\t\t\"humidity\": \"49\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.04\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"17\",\"hour_padded\": \"17\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472590800\",\"pretty\": \"5:00 PM EDT on August 30, 2016\",\"civil\": \"5:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"162\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"54\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.03\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"18\",\"hour_padded\": \"18\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472594400\",\"pretty\": \"6:00 PM EDT on August 30, 2016\",\"civil\": \"6:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"5\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSE\", \"degrees\": \"167\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"59\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.02\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"19\",\"hour_padded\": \"19\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472598000\",\"pretty\": \"7:00 PM EDT on August 30, 2016\",\"civil\": \"7:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"171\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"65\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.02\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"20\",\"hour_padded\": \"20\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472601600\",\"pretty\": \"8:00 PM EDT on August 30, 2016\",\"civil\": \"8:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"171\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"71\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"5\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.02\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"21\",\"hour_padded\": \"21\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472605200\",\"pretty\": \"9:00 PM EDT on August 30, 2016\",\"civil\": \"9:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"169\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"75\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.02\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"22\",\"hour_padded\": \"22\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472608800\",\"pretty\": \"10:00 PM EDT on August 30, 2016\",\"civil\": \"10:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"172\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"79\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.03\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"23\",\"hour_padded\": \"23\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"30\",\"mday_padded\": \"30\",\"yday\": \"242\",\"isdst\": \"1\",\"epoch\": \"1472612400\",\"pretty\": \"11:00 PM EDT on August 30, 2016\",\"civil\": \"11:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"181\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"82\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"7\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.03\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"0\",\"hour_padded\": \"00\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472616000\",\"pretty\": \"12:00 AM EDT on August 31, 2016\",\"civil\": \"12:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"188\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"85\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"8\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.02\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"1\",\"hour_padded\": \"01\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472619600\",\"pretty\": \"1:00 AM EDT on August 31, 2016\",\"civil\": \"1:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"201\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"87\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"8\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.01\", \"metric\": \"1016\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"2\",\"hour_padded\": \"02\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472623200\",\"pretty\": \"2:00 AM EDT on August 31, 2016\",\"civil\": \"2:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"212\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"89\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"8\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.0\", \"metric\": \"1016\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"3\",\"hour_padded\": \"03\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472626800\",\"pretty\": \"3:00 AM EDT on August 31, 2016\",\"civil\": \"3:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"4\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"223\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"90\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"9\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.99\", \"metric\": \"1016\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"4\",\"hour_padded\": \"04\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472630400\",\"pretty\": \"4:00 AM EDT on August 31, 2016\",\"civil\": \"4:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"6\",\n" +
           "\t\t\"wspd\": {\"english\": \"4\", \"metric\": \"6\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"237\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"91\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"9\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.98\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"5\",\"hour_padded\": \"05\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472634000\",\"pretty\": \"5:00 AM EDT on August 31, 2016\",\"civil\": \"5:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"4\", \"metric\": \"6\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"244\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"93\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"9\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.98\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"6\",\"hour_padded\": \"06\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472637600\",\"pretty\": \"6:00 AM EDT on August 31, 2016\",\"civil\": \"6:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"9\",\n" +
           "\t\t\"wspd\": {\"english\": \"4\", \"metric\": \"6\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"239\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"93\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"9\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.97\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"7\",\"hour_padded\": \"07\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472641200\",\"pretty\": \"7:00 AM EDT on August 31, 2016\",\"civil\": \"7:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"11\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"239\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"90\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"8\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.98\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"8\",\"hour_padded\": \"08\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472644800\",\"pretty\": \"8:00 AM EDT on August 31, 2016\",\"civil\": \"8:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"13\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"233\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"83\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"7\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.98\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"9\",\"hour_padded\": \"09\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472648400\",\"pretty\": \"9:00 AM EDT on August 31, 2016\",\"civil\": \"9:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"69\", \"metric\": \"21\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"12\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"247\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"76\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"5\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.98\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"10\",\"hour_padded\": \"10\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472652000\",\"pretty\": \"10:00 AM EDT on August 31, 2016\",\"civil\": \"10:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"36\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"247\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"4\",\n" +
           "\t\t\"humidity\": \"67\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.97\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"11\",\"hour_padded\": \"11\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472655600\",\"pretty\": \"11:00 AM EDT on August 31, 2016\",\"civil\": \"11:00 AM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"36\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"233\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"61\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.96\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"12\",\"hour_padded\": \"12\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472659200\",\"pretty\": \"12:00 PM EDT on August 31, 2016\",\"civil\": \"12:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"38\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"218\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"55\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"87\", \"metric\": \"30\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"87\", \"metric\": \"30\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.94\", \"metric\": \"1014\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"13\",\"hour_padded\": \"13\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472662800\",\"pretty\": \"1:00 PM EDT on August 31, 2016\",\"civil\": \"1:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"44\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"211\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"87\", \"metric\": \"30\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"87\", \"metric\": \"30\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.91\", \"metric\": \"1013\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"14\",\"hour_padded\": \"14\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472666400\",\"pretty\": \"2:00 PM EDT on August 31, 2016\",\"civil\": \"2:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"86\", \"metric\": \"30\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"47\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"202\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"52\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.89\", \"metric\": \"1012\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"15\",\"hour_padded\": \"15\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472670000\",\"pretty\": \"3:00 PM EDT on August 31, 2016\",\"civil\": \"3:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"86\", \"metric\": \"30\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"48\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"197\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.87\", \"metric\": \"1012\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"16\",\"hour_padded\": \"16\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472673600\",\"pretty\": \"4:00 PM EDT on August 31, 2016\",\"civil\": \"4:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"86\", \"metric\": \"30\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"47\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"192\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"3\",\n" +
           "\t\t\"humidity\": \"54\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"88\", \"metric\": \"31\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.86\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"17\",\"hour_padded\": \"17\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472677200\",\"pretty\": \"5:00 PM EDT on August 31, 2016\",\"civil\": \"5:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"48\",\n" +
           "\t\t\"wspd\": {\"english\": \"14\", \"metric\": \"23\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"189\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"57\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"87\", \"metric\": \"31\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"87\", \"metric\": \"31\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.85\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"18\",\"hour_padded\": \"18\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472680800\",\"pretty\": \"6:00 PM EDT on August 31, 2016\",\"civil\": \"6:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"29\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"192\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"61\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"85\", \"metric\": \"30\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"85\", \"metric\": \"30\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"9\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.85\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"19\",\"hour_padded\": \"19\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472684400\",\"pretty\": \"7:00 PM EDT on August 31, 2016\",\"civil\": \"7:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"34\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"199\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"65\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"11\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.85\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"20\",\"hour_padded\": \"20\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472688000\",\"pretty\": \"8:00 PM EDT on August 31, 2016\",\"civil\": \"8:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"38\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"206\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"70\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.85\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"21\",\"hour_padded\": \"21\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472691600\",\"pretty\": \"9:00 PM EDT on August 31, 2016\",\"civil\": \"9:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"42\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"206\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"73\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.86\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"22\",\"hour_padded\": \"22\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472695200\",\"pretty\": \"10:00 PM EDT on August 31, 2016\",\"civil\": \"10:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"69\", \"metric\": \"21\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"45\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"213\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"76\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"14\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.86\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"23\",\"hour_padded\": \"23\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"8\",\"mon_padded\": \"08\",\"mon_abbrev\": \"Aug\",\"mday\": \"31\",\"mday_padded\": \"31\",\"yday\": \"243\",\"isdst\": \"1\",\"epoch\": \"1472698800\",\"pretty\": \"11:00 PM EDT on August 31, 2016\",\"civil\": \"11:00 PM\",\"month_name\": \"August\",\"month_name_abbrev\": \"Aug\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"69\", \"metric\": \"21\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"47\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"224\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"78\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"13\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.86\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"0\",\"hour_padded\": \"00\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472702400\",\"pretty\": \"12:00 AM EDT on September 01, 2016\",\"civil\": \"12:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"69\", \"metric\": \"21\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"54\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"247\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"79\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.85\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"1\",\"hour_padded\": \"01\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472706000\",\"pretty\": \"1:00 AM EDT on September 01, 2016\",\"civil\": \"1:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Mostly Cloudy\",\n" +
           "\t\t\"icon\": \"mostlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_mostlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"3\",\n" +
           "\t\t\"sky\": \"63\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"272\"},\n" +
           "\t\t\"wx\": \"Mostly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"80\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.84\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"2\",\"hour_padded\": \"02\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472709600\",\"pretty\": \"2:00 AM EDT on September 01, 2016\",\"civil\": \"2:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Mostly Cloudy\",\n" +
           "\t\t\"icon\": \"mostlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_mostlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"3\",\n" +
           "\t\t\"sky\": \"66\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"279\"},\n" +
           "\t\t\"wx\": \"Mostly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"82\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"13\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.83\", \"metric\": \"1010\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"3\",\"hour_padded\": \"03\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472713200\",\"pretty\": \"3:00 AM EDT on September 01, 2016\",\"civil\": \"3:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"56\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WNW\", \"degrees\": \"293\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"83\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"13\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.83\", \"metric\": \"1010\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"4\",\"hour_padded\": \"04\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472716800\",\"pretty\": \"4:00 AM EDT on September 01, 2016\",\"civil\": \"4:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"37\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WNW\", \"degrees\": \"303\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"84\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"13\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.83\", \"metric\": \"1010\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"5\",\"hour_padded\": \"05\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472720400\",\"pretty\": \"5:00 AM EDT on September 01, 2016\",\"civil\": \"5:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"27\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NW\", \"degrees\": \"315\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"85\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"11\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.82\", \"metric\": \"1010\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"6\",\"hour_padded\": \"06\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472724000\",\"pretty\": \"6:00 AM EDT on September 01, 2016\",\"civil\": \"6:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"29\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NW\", \"degrees\": \"327\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"82\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"10\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.83\", \"metric\": \"1010\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"7\",\"hour_padded\": \"07\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472727600\",\"pretty\": \"7:00 AM EDT on September 01, 2016\",\"civil\": \"7:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"32\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"N\", \"degrees\": \"350\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"82\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"10\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.85\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"8\",\"hour_padded\": \"08\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472731200\",\"pretty\": \"8:00 AM EDT on September 01, 2016\",\"civil\": \"8:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"33\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"N\", \"degrees\": \"357\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"79\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"11\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.86\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"9\",\"hour_padded\": \"09\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472734800\",\"pretty\": \"9:00 AM EDT on September 01, 2016\",\"civil\": \"9:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"27\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"N\", \"degrees\": \"355\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"73\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"8\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.87\", \"metric\": \"1012\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"10\",\"hour_padded\": \"10\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472738400\",\"pretty\": \"10:00 AM EDT on September 01, 2016\",\"civil\": \"10:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"43\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"N\", \"degrees\": \"353\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"4\",\n" +
           "\t\t\"humidity\": \"66\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.87\", \"metric\": \"1012\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"11\",\"hour_padded\": \"11\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472742000\",\"pretty\": \"11:00 AM EDT on September 01, 2016\",\"civil\": \"11:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"40\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"N\", \"degrees\": \"349\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"6\",\n" +
           "\t\t\"humidity\": \"59\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.87\", \"metric\": \"1012\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"12\",\"hour_padded\": \"12\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472745600\",\"pretty\": \"12:00 PM EDT on September 01, 2016\",\"civil\": \"12:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"39\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"345\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"55\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.86\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"13\",\"hour_padded\": \"13\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472749200\",\"pretty\": \"1:00 PM EDT on September 01, 2016\",\"civil\": \"1:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"40\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"334\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"8\",\n" +
           "\t\t\"humidity\": \"52\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.85\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"14\",\"hour_padded\": \"14\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472752800\",\"pretty\": \"2:00 PM EDT on September 01, 2016\",\"civil\": \"2:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"41\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"336\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"49\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.84\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"15\",\"hour_padded\": \"15\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472756400\",\"pretty\": \"3:00 PM EDT on September 01, 2016\",\"civil\": \"3:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"46\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"334\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"48\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.83\", \"metric\": \"1010\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"16\",\"hour_padded\": \"16\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472760000\",\"pretty\": \"4:00 PM EDT on September 01, 2016\",\"civil\": \"4:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"59\", \"metric\": \"15\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"55\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"337\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"3\",\n" +
           "\t\t\"humidity\": \"48\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.83\", \"metric\": \"1010\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"17\",\"hour_padded\": \"17\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472763600\",\"pretty\": \"5:00 PM EDT on September 01, 2016\",\"civil\": \"5:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"58\", \"metric\": \"14\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"59\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"342\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"48\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"15\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.83\", \"metric\": \"1010\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"18\",\"hour_padded\": \"18\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472767200\",\"pretty\": \"6:00 PM EDT on September 01, 2016\",\"civil\": \"6:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"58\", \"metric\": \"14\"},\n" +
           "\t\t\"condition\": \"Partly Cloudy\",\n" +
           "\t\t\"icon\": \"partlycloudy\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/partlycloudy.gif\",\n" +
           "\t\t\"fctcode\": \"2\",\n" +
           "\t\t\"sky\": \"35\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"340\"},\n" +
           "\t\t\"wx\": \"Partly Cloudy\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"51\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.85\", \"metric\": \"1011\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"19\",\"hour_padded\": \"19\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472770800\",\"pretty\": \"7:00 PM EDT on September 01, 2016\",\"civil\": \"7:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"58\", \"metric\": \"14\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"24\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"342\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.87\", \"metric\": \"1012\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"20\",\"hour_padded\": \"20\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472774400\",\"pretty\": \"8:00 PM EDT on September 01, 2016\",\"civil\": \"8:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"57\", \"metric\": \"14\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"16\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"343\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"55\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.89\", \"metric\": \"1012\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"21\",\"hour_padded\": \"21\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472778000\",\"pretty\": \"9:00 PM EDT on September 01, 2016\",\"civil\": \"9:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"55\", \"metric\": \"13\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"11\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"342\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.92\", \"metric\": \"1013\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"22\",\"hour_padded\": \"22\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472781600\",\"pretty\": \"10:00 PM EDT on September 01, 2016\",\"civil\": \"10:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"54\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"6\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"342\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.94\", \"metric\": \"1014\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"23\",\"hour_padded\": \"23\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"1\",\"mday_padded\": \"01\",\"yday\": \"244\",\"isdst\": \"1\",\"epoch\": \"1472785200\",\"pretty\": \"11:00 PM EDT on September 01, 2016\",\"civil\": \"11:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Thursday\",\"weekday_name_night\": \"Thursday Night\",\"weekday_name_abbrev\": \"Thu\",\"weekday_name_unlang\": \"Thursday\",\"weekday_name_night_unlang\": \"Thursday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"53\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"342\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.96\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"0\",\"hour_padded\": \"00\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472788800\",\"pretty\": \"12:00 AM EDT on September 02, 2016\",\"civil\": \"12:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"52\", \"metric\": \"11\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"342\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.97\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"1\",\"hour_padded\": \"01\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472792400\",\"pretty\": \"1:00 AM EDT on September 02, 2016\",\"civil\": \"1:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"51\", \"metric\": \"11\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"343\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.97\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"2\",\"hour_padded\": \"02\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472796000\",\"pretty\": \"2:00 AM EDT on September 02, 2016\",\"civil\": \"2:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"49\", \"metric\": \"9\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"339\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.98\", \"metric\": \"1015\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"3\",\"hour_padded\": \"03\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472799600\",\"pretty\": \"3:00 AM EDT on September 02, 2016\",\"civil\": \"3:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"49\", \"metric\": \"9\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"342\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"29.99\", \"metric\": \"1016\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"4\",\"hour_padded\": \"04\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472803200\",\"pretty\": \"4:00 AM EDT on September 02, 2016\",\"civil\": \"4:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"48\", \"metric\": \"9\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"336\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"54\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.0\", \"metric\": \"1016\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"5\",\"hour_padded\": \"05\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472806800\",\"pretty\": \"5:00 AM EDT on September 02, 2016\",\"civil\": \"5:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"48\", \"metric\": \"9\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"334\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"54\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.01\", \"metric\": \"1016\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"6\",\"hour_padded\": \"06\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472810400\",\"pretty\": \"6:00 AM EDT on September 02, 2016\",\"civil\": \"6:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"47\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"336\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"56\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.02\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"7\",\"hour_padded\": \"07\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472814000\",\"pretty\": \"7:00 AM EDT on September 02, 2016\",\"civil\": \"7:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"47\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"340\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"55\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.04\", \"metric\": \"1017\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"8\",\"hour_padded\": \"08\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472817600\",\"pretty\": \"8:00 AM EDT on September 02, 2016\",\"civil\": \"8:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"341\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"51\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.05\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"9\",\"hour_padded\": \"09\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472821200\",\"pretty\": \"9:00 AM EDT on September 02, 2016\",\"civil\": \"9:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"339\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"46\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.06\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"10\",\"hour_padded\": \"10\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472824800\",\"pretty\": \"10:00 AM EDT on September 02, 2016\",\"civil\": \"10:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"69\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"45\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"339\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"4\",\n" +
           "\t\t\"humidity\": \"42\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"69\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.06\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"11\",\"hour_padded\": \"11\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472828400\",\"pretty\": \"11:00 AM EDT on September 02, 2016\",\"civil\": \"11:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"44\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"336\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"6\",\n" +
           "\t\t\"humidity\": \"39\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.06\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"12\",\"hour_padded\": \"12\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472832000\",\"pretty\": \"12:00 PM EDT on September 02, 2016\",\"civil\": \"12:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"44\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"334\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"36\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.06\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"13\",\"hour_padded\": \"13\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472835600\",\"pretty\": \"1:00 PM EDT on September 02, 2016\",\"civil\": \"1:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"44\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"0\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"330\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"8\",\n" +
           "\t\t\"humidity\": \"35\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.05\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"14\",\"hour_padded\": \"14\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472839200\",\"pretty\": \"2:00 PM EDT on September 02, 2016\",\"civil\": \"2:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"44\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"336\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"34\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.05\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"15\",\"hour_padded\": \"15\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472842800\",\"pretty\": \"3:00 PM EDT on September 02, 2016\",\"civil\": \"3:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"44\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"331\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"33\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.05\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"16\",\"hour_padded\": \"16\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472846400\",\"pretty\": \"4:00 PM EDT on September 02, 2016\",\"civil\": \"4:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"44\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"333\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"3\",\n" +
           "\t\t\"humidity\": \"33\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.05\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"17\",\"hour_padded\": \"17\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472850000\",\"pretty\": \"5:00 PM EDT on September 02, 2016\",\"civil\": \"5:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"44\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"337\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"34\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.05\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"18\",\"hour_padded\": \"18\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472853600\",\"pretty\": \"6:00 PM EDT on September 02, 2016\",\"civil\": \"6:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"45\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"330\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"37\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.06\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"19\",\"hour_padded\": \"19\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472857200\",\"pretty\": \"7:00 PM EDT on September 02, 2016\",\"civil\": \"7:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"327\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"40\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.07\", \"metric\": \"1018\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"20\",\"hour_padded\": \"20\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472860800\",\"pretty\": \"8:00 PM EDT on September 02, 2016\",\"civil\": \"8:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"328\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"43\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.08\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"21\",\"hour_padded\": \"21\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472864400\",\"pretty\": \"9:00 PM EDT on September 02, 2016\",\"civil\": \"9:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"330\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"45\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"22\",\"hour_padded\": \"22\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472868000\",\"pretty\": \"10:00 PM EDT on September 02, 2016\",\"civil\": \"10:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"1\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"332\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"48\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"23\",\"hour_padded\": \"23\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"2\",\"mday_padded\": \"02\",\"yday\": \"245\",\"isdst\": \"1\",\"epoch\": \"1472871600\",\"pretty\": \"11:00 PM EDT on September 02, 2016\",\"civil\": \"11:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Friday\",\"weekday_name_night\": \"Friday Night\",\"weekday_name_abbrev\": \"Fri\",\"weekday_name_unlang\": \"Friday\",\"weekday_name_night_unlang\": \"Friday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"333\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"50\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"0\",\"hour_padded\": \"00\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472875200\",\"pretty\": \"12:00 AM EDT on September 03, 2016\",\"civil\": \"12:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"332\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"52\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.14\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"1\",\"hour_padded\": \"01\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472878800\",\"pretty\": \"1:00 AM EDT on September 03, 2016\",\"civil\": \"1:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"336\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"54\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"2\",\"hour_padded\": \"02\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472882400\",\"pretty\": \"2:00 AM EDT on September 03, 2016\",\"civil\": \"2:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"335\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"56\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"3\",\"hour_padded\": \"03\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472886000\",\"pretty\": \"3:00 AM EDT on September 03, 2016\",\"civil\": \"3:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"337\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"58\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.17\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"4\",\"hour_padded\": \"04\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472889600\",\"pretty\": \"4:00 AM EDT on September 03, 2016\",\"civil\": \"4:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"45\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"334\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"60\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.18\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"5\",\"hour_padded\": \"05\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472893200\",\"pretty\": \"5:00 AM EDT on September 03, 2016\",\"civil\": \"5:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"59\", \"metric\": \"15\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"335\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"62\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"59\", \"metric\": \"15\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.19\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"6\",\"hour_padded\": \"06\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472896800\",\"pretty\": \"6:00 AM EDT on September 03, 2016\",\"civil\": \"6:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"58\", \"metric\": \"14\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"340\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"64\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"58\", \"metric\": \"14\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.2\", \"metric\": \"1023\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"7\",\"hour_padded\": \"07\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472900400\",\"pretty\": \"7:00 AM EDT on September 03, 2016\",\"civil\": \"7:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"59\", \"metric\": \"15\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"3\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"342\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"62\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"59\", \"metric\": \"15\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.2\", \"metric\": \"1023\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"8\",\"hour_padded\": \"08\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472904000\",\"pretty\": \"8:00 AM EDT on September 03, 2016\",\"civil\": \"8:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"47\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"2\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"342\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"58\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.2\", \"metric\": \"1023\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"9\",\"hour_padded\": \"09\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472907600\",\"pretty\": \"9:00 AM EDT on September 03, 2016\",\"civil\": \"9:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"47\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"4\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"337\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"52\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.19\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"10\",\"hour_padded\": \"10\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472911200\",\"pretty\": \"10:00 AM EDT on September 03, 2016\",\"civil\": \"10:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"4\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"337\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"4\",\n" +
           "\t\t\"humidity\": \"44\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.19\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"11\",\"hour_padded\": \"11\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472914800\",\"pretty\": \"11:00 AM EDT on September 03, 2016\",\"civil\": \"11:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"44\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"4\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NNW\", \"degrees\": \"327\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"6\",\n" +
           "\t\t\"humidity\": \"38\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.18\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"12\",\"hour_padded\": \"12\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472918400\",\"pretty\": \"12:00 PM EDT on September 03, 2016\",\"civil\": \"12:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"43\", \"metric\": \"6\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"4\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NW\", \"degrees\": \"318\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"33\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.17\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"13\",\"hour_padded\": \"13\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472922000\",\"pretty\": \"1:00 PM EDT on September 03, 2016\",\"civil\": \"1:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"43\", \"metric\": \"6\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"4\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WNW\", \"degrees\": \"300\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"8\",\n" +
           "\t\t\"humidity\": \"30\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"14\",\"hour_padded\": \"14\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472925600\",\"pretty\": \"2:00 PM EDT on September 03, 2016\",\"civil\": \"2:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"44\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"4\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"NW\", \"degrees\": \"306\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"30\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.14\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"15\",\"hour_padded\": \"15\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472929200\",\"pretty\": \"3:00 PM EDT on September 03, 2016\",\"civil\": \"3:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"45\", \"metric\": \"7\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"4\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"267\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"32\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.14\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"16\",\"hour_padded\": \"16\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472932800\",\"pretty\": \"4:00 PM EDT on September 03, 2016\",\"civil\": \"4:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"46\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"5\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"249\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"3\",\n" +
           "\t\t\"humidity\": \"33\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"17\",\"hour_padded\": \"17\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472936400\",\"pretty\": \"5:00 PM EDT on September 03, 2016\",\"civil\": \"5:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"47\", \"metric\": \"8\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"5\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"232\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"35\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"18\",\"hour_padded\": \"18\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472940000\",\"pretty\": \"6:00 PM EDT on September 03, 2016\",\"civil\": \"6:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"48\", \"metric\": \"9\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"6\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"218\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"39\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"19\",\"hour_padded\": \"19\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472943600\",\"pretty\": \"7:00 PM EDT on September 03, 2016\",\"civil\": \"7:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"49\", \"metric\": \"9\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"6\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"208\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"44\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"20\",\"hour_padded\": \"20\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472947200\",\"pretty\": \"8:00 PM EDT on September 03, 2016\",\"civil\": \"8:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"50\", \"metric\": \"10\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"6\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"209\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"49\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"21\",\"hour_padded\": \"21\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472950800\",\"pretty\": \"9:00 PM EDT on September 03, 2016\",\"civil\": \"9:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"50\", \"metric\": \"10\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"213\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"68\", \"metric\": \"20\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"22\",\"hour_padded\": \"22\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472954400\",\"pretty\": \"10:00 PM EDT on September 03, 2016\",\"civil\": \"10:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"52\", \"metric\": \"11\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"9\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"236\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"58\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"67\", \"metric\": \"19\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.14\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"23\",\"hour_padded\": \"23\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"3\",\"mday_padded\": \"03\",\"yday\": \"246\",\"isdst\": \"1\",\"epoch\": \"1472958000\",\"pretty\": \"11:00 PM EDT on September 03, 2016\",\"civil\": \"11:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Saturday\",\"weekday_name_night\": \"Saturday Night\",\"weekday_name_abbrev\": \"Sat\",\"weekday_name_unlang\": \"Saturday\",\"weekday_name_night_unlang\": \"Saturday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"53\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"10\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"256\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"62\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.15\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"0\",\"hour_padded\": \"00\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1472961600\",\"pretty\": \"12:00 AM EDT on September 04, 2016\",\"civil\": \"12:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"53\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"12\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"271\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"64\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.15\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"1\",\"hour_padded\": \"01\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1472965200\",\"pretty\": \"1:00 AM EDT on September 04, 2016\",\"civil\": \"1:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"53\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"13\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"281\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"67\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.15\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"2\",\"hour_padded\": \"02\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1472968800\",\"pretty\": \"2:00 AM EDT on September 04, 2016\",\"civil\": \"2:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"53\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"13\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"272\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"69\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.15\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"3\",\"hour_padded\": \"03\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1472972400\",\"pretty\": \"3:00 AM EDT on September 04, 2016\",\"civil\": \"3:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"52\", \"metric\": \"11\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"13\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"264\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"70\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"4\",\"hour_padded\": \"04\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1472976000\",\"pretty\": \"4:00 AM EDT on September 04, 2016\",\"civil\": \"4:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"52\", \"metric\": \"11\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"12\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"264\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"70\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"5\",\"hour_padded\": \"05\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1472979600\",\"pretty\": \"5:00 AM EDT on September 04, 2016\",\"civil\": \"5:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"52\", \"metric\": \"11\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"10\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"277\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"71\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"6\",\"hour_padded\": \"06\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1472983200\",\"pretty\": \"6:00 AM EDT on September 04, 2016\",\"civil\": \"6:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"52\", \"metric\": \"11\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"8\",\n" +
           "\t\t\"wspd\": {\"english\": \"5\", \"metric\": \"8\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WNW\", \"degrees\": \"286\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"68\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.17\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"7\",\"hour_padded\": \"07\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1472986800\",\"pretty\": \"7:00 AM EDT on September 04, 2016\",\"civil\": \"7:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"52\", \"metric\": \"11\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"6\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WNW\", \"degrees\": \"291\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"66\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.17\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"8\",\"hour_padded\": \"08\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1472990400\",\"pretty\": \"8:00 AM EDT on September 04, 2016\",\"civil\": \"8:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"53\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"6\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"277\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"63\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"66\", \"metric\": \"19\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.18\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"9\",\"hour_padded\": \"09\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1472994000\",\"pretty\": \"9:00 AM EDT on September 04, 2016\",\"civil\": \"9:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"53\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"6\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"267\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"55\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.18\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"10\",\"hour_padded\": \"10\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1472997600\",\"pretty\": \"10:00 AM EDT on September 04, 2016\",\"civil\": \"10:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"53\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"254\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"4\",\n" +
           "\t\t\"humidity\": \"48\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.17\", \"metric\": \"1022\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"11\",\"hour_padded\": \"11\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473001200\",\"pretty\": \"11:00 AM EDT on September 04, 2016\",\"civil\": \"11:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"53\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"8\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"232\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"6\",\n" +
           "\t\t\"humidity\": \"43\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"12\",\"hour_padded\": \"12\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473004800\",\"pretty\": \"12:00 PM EDT on September 04, 2016\",\"civil\": \"12:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"53\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"8\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"215\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"40\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.15\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"13\",\"hour_padded\": \"13\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473008400\",\"pretty\": \"1:00 PM EDT on September 04, 2016\",\"civil\": \"1:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"53\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"209\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"38\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.14\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"14\",\"hour_padded\": \"14\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473012000\",\"pretty\": \"2:00 PM EDT on September 04, 2016\",\"civil\": \"2:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"54\", \"metric\": \"12\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"7\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"201\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"38\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"15\",\"hour_padded\": \"15\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473015600\",\"pretty\": \"3:00 PM EDT on September 04, 2016\",\"civil\": \"3:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"55\", \"metric\": \"13\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"6\",\n" +
           "\t\t\"wspd\": {\"english\": \"14\", \"metric\": \"23\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"199\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"40\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"16\",\"hour_padded\": \"16\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473019200\",\"pretty\": \"4:00 PM EDT on September 04, 2016\",\"civil\": \"4:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"56\", \"metric\": \"13\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"6\",\n" +
           "\t\t\"wspd\": {\"english\": \"15\", \"metric\": \"24\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"195\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"3\",\n" +
           "\t\t\"humidity\": \"43\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"17\",\"hour_padded\": \"17\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473022800\",\"pretty\": \"5:00 PM EDT on September 04, 2016\",\"civil\": \"5:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"57\", \"metric\": \"14\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"5\",\n" +
           "\t\t\"wspd\": {\"english\": \"16\", \"metric\": \"26\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"193\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"46\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"18\",\"hour_padded\": \"18\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473026400\",\"pretty\": \"6:00 PM EDT on September 04, 2016\",\"civil\": \"6:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"57\", \"metric\": \"14\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"5\",\n" +
           "\t\t\"wspd\": {\"english\": \"16\", \"metric\": \"26\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"198\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"48\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"19\",\"hour_padded\": \"19\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473030000\",\"pretty\": \"7:00 PM EDT on September 04, 2016\",\"civil\": \"7:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"58\", \"metric\": \"14\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"5\",\n" +
           "\t\t\"wspd\": {\"english\": \"15\", \"metric\": \"24\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"200\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"52\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.09\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"20\",\"hour_padded\": \"20\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473033600\",\"pretty\": \"8:00 PM EDT on September 04, 2016\",\"civil\": \"8:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"59\", \"metric\": \"15\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"6\",\n" +
           "\t\t\"wspd\": {\"english\": \"14\", \"metric\": \"23\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"199\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"57\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.09\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"21\",\"hour_padded\": \"21\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473037200\",\"pretty\": \"9:00 PM EDT on September 04, 2016\",\"civil\": \"9:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"59\", \"metric\": \"15\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"8\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"199\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"59\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.09\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"22\",\"hour_padded\": \"22\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473040800\",\"pretty\": \"10:00 PM EDT on September 04, 2016\",\"civil\": \"10:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"9\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"203\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"61\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.09\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"23\",\"hour_padded\": \"23\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"4\",\"mday_padded\": \"04\",\"yday\": \"247\",\"isdst\": \"1\",\"epoch\": \"1473044400\",\"pretty\": \"11:00 PM EDT on September 04, 2016\",\"civil\": \"11:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Sunday\",\"weekday_name_night\": \"Sunday Night\",\"weekday_name_abbrev\": \"Sun\",\"weekday_name_unlang\": \"Sunday\",\"weekday_name_night_unlang\": \"Sunday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"60\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"11\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"213\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"63\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"0\",\"hour_padded\": \"00\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473048000\",\"pretty\": \"12:00 AM EDT on September 05, 2016\",\"civil\": \"12:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"12\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"226\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"64\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"1\",\"hour_padded\": \"01\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473051600\",\"pretty\": \"1:00 AM EDT on September 05, 2016\",\"civil\": \"1:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"14\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"235\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"66\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"2\",\"hour_padded\": \"02\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473055200\",\"pretty\": \"2:00 AM EDT on September 05, 2016\",\"civil\": \"2:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"15\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"235\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"68\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"3\",\"hour_padded\": \"03\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473058800\",\"pretty\": \"3:00 AM EDT on September 05, 2016\",\"civil\": \"3:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"17\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"235\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"70\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"4\",\"hour_padded\": \"04\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473062400\",\"pretty\": \"4:00 AM EDT on September 05, 2016\",\"civil\": \"4:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"19\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"241\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"72\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"5\",\"hour_padded\": \"05\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473066000\",\"pretty\": \"5:00 AM EDT on September 05, 2016\",\"civil\": \"5:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"21\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"244\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"73\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"6\",\"hour_padded\": \"06\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473069600\",\"pretty\": \"6:00 AM EDT on September 05, 2016\",\"civil\": \"6:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"24\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"238\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"74\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"70\", \"metric\": \"21\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"7\",\"hour_padded\": \"07\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473073200\",\"pretty\": \"7:00 AM EDT on September 05, 2016\",\"civil\": \"7:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"26\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"236\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"73\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"71\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"8\",\"hour_padded\": \"08\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473076800\",\"pretty\": \"8:00 AM EDT on September 05, 2016\",\"civil\": \"8:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"28\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"234\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"70\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"9\",\"hour_padded\": \"09\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473080400\",\"pretty\": \"9:00 AM EDT on September 05, 2016\",\"civil\": \"9:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"28\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"228\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"65\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"10\",\"hour_padded\": \"10\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473084000\",\"pretty\": \"10:00 AM EDT on September 05, 2016\",\"civil\": \"10:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"28\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"219\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"4\",\n" +
           "\t\t\"humidity\": \"60\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"11\",\"hour_padded\": \"11\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473087600\",\"pretty\": \"11:00 AM EDT on September 05, 2016\",\"civil\": \"11:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"27\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"209\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"54\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"12\",\"hour_padded\": \"12\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473091200\",\"pretty\": \"12:00 PM EDT on September 05, 2016\",\"civil\": \"12:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"27\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"200\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"49\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"13\",\"hour_padded\": \"13\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473094800\",\"pretty\": \"1:00 PM EDT on September 05, 2016\",\"civil\": \"1:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"26\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"197\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"46\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"14\",\"hour_padded\": \"14\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473098400\",\"pretty\": \"2:00 PM EDT on September 05, 2016\",\"civil\": \"2:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"61\", \"metric\": \"16\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"25\",\n" +
           "\t\t\"wspd\": {\"english\": \"14\", \"metric\": \"23\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"192\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"45\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"15\",\"hour_padded\": \"15\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473102000\",\"pretty\": \"3:00 PM EDT on September 05, 2016\",\"civil\": \"3:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"24\",\n" +
           "\t\t\"wspd\": {\"english\": \"14\", \"metric\": \"23\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"191\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"47\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"16\",\"hour_padded\": \"16\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473105600\",\"pretty\": \"4:00 PM EDT on September 05, 2016\",\"civil\": \"4:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"22\",\n" +
           "\t\t\"wspd\": {\"english\": \"14\", \"metric\": \"23\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"190\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"3\",\n" +
           "\t\t\"humidity\": \"49\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"17\",\"hour_padded\": \"17\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473109200\",\"pretty\": \"5:00 PM EDT on September 05, 2016\",\"civil\": \"5:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"21\",\n" +
           "\t\t\"wspd\": {\"english\": \"15\", \"metric\": \"24\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"188\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"51\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"18\",\"hour_padded\": \"18\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473112800\",\"pretty\": \"6:00 PM EDT on September 05, 2016\",\"civil\": \"6:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"20\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"192\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"54\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"19\",\"hour_padded\": \"19\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473116400\",\"pretty\": \"7:00 PM EDT on September 05, 2016\",\"civil\": \"7:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"19\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"194\"},\n" +
           "\t\t\"wx\": \"Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"58\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.1\", \"metric\": \"1019\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"20\",\"hour_padded\": \"20\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473120000\",\"pretty\": \"8:00 PM EDT on September 05, 2016\",\"civil\": \"8:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"17\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"192\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"62\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"21\",\"hour_padded\": \"21\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473123600\",\"pretty\": \"9:00 PM EDT on September 05, 2016\",\"civil\": \"9:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"18\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"190\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"65\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.11\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"22\",\"hour_padded\": \"22\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473127200\",\"pretty\": \"10:00 PM EDT on September 05, 2016\",\"civil\": \"10:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"17\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"193\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"67\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"23\",\"hour_padded\": \"23\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"5\",\"mday_padded\": \"05\",\"yday\": \"248\",\"isdst\": \"1\",\"epoch\": \"1473130800\",\"pretty\": \"11:00 PM EDT on September 05, 2016\",\"civil\": \"11:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Monday\",\"weekday_name_night\": \"Monday Night\",\"weekday_name_abbrev\": \"Mon\",\"weekday_name_unlang\": \"Monday\",\"weekday_name_night_unlang\": \"Monday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"16\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"195\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"69\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"5\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.12\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"0\",\"hour_padded\": \"00\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473134400\",\"pretty\": \"12:00 AM EDT on September 06, 2016\",\"civil\": \"12:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"16\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"199\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"70\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"5\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"1\",\"hour_padded\": \"01\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473138000\",\"pretty\": \"1:00 AM EDT on September 06, 2016\",\"civil\": \"1:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"16\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"205\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"72\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"5\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"2\",\"hour_padded\": \"02\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473141600\",\"pretty\": \"2:00 AM EDT on September 06, 2016\",\"civil\": \"2:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"16\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"205\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"72\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.13\", \"metric\": \"1020\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"3\",\"hour_padded\": \"03\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473145200\",\"pretty\": \"3:00 AM EDT on September 06, 2016\",\"civil\": \"3:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"16\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"195\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"73\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.14\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"4\",\"hour_padded\": \"04\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473148800\",\"pretty\": \"4:00 AM EDT on September 06, 2016\",\"civil\": \"4:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"17\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"215\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"73\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.14\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"5\",\"hour_padded\": \"05\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473152400\",\"pretty\": \"5:00 AM EDT on September 06, 2016\",\"civil\": \"5:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"19\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"222\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"75\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.14\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"6\",\"hour_padded\": \"06\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473156000\",\"pretty\": \"6:00 AM EDT on September 06, 2016\",\"civil\": \"6:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"20\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"217\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"76\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"72\", \"metric\": \"22\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.15\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"7\",\"hour_padded\": \"07\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473159600\",\"pretty\": \"7:00 AM EDT on September 06, 2016\",\"civil\": \"7:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"21\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"208\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"76\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"73\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"8\",\"hour_padded\": \"08\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473163200\",\"pretty\": \"8:00 AM EDT on September 06, 2016\",\"civil\": \"8:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"65\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"22\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"204\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"72\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"5\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.16\", \"metric\": \"1021\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"9\",\"hour_padded\": \"09\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473166800\",\"pretty\": \"9:00 AM EDT on September 06, 2016\",\"civil\": \"9:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"26\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"W\", \"degrees\": \"273\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"2\",\n" +
           "\t\t\"humidity\": \"65\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.26\", \"metric\": \"1025\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"10\",\"hour_padded\": \"10\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473170400\",\"pretty\": \"10:00 AM EDT on September 06, 2016\",\"civil\": \"10:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"26\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"WSW\", \"degrees\": \"242\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"4\",\n" +
           "\t\t\"humidity\": \"60\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.26\", \"metric\": \"1025\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"11\",\"hour_padded\": \"11\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473174000\",\"pretty\": \"11:00 AM EDT on September 06, 2016\",\"civil\": \"11:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"81\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"27\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"209\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"55\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.26\", \"metric\": \"1025\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"12\",\"hour_padded\": \"12\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473177600\",\"pretty\": \"12:00 PM EDT on September 06, 2016\",\"civil\": \"12:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"26\",\n" +
           "\t\t\"wspd\": {\"english\": \"10\", \"metric\": \"16\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"187\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"51\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"83\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"83\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.26\", \"metric\": \"1025\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"13\",\"hour_padded\": \"13\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473181200\",\"pretty\": \"1:00 PM EDT on September 06, 2016\",\"civil\": \"1:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"62\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"25\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"183\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"49\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.25\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"14\",\"hour_padded\": \"14\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473184800\",\"pretty\": \"2:00 PM EDT on September 06, 2016\",\"civil\": \"2:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"25\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"177\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"7\",\n" +
           "\t\t\"humidity\": \"49\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"85\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.25\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"15\",\"hour_padded\": \"15\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473188400\",\"pretty\": \"3:00 PM EDT on September 06, 2016\",\"civil\": \"3:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"25\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"180\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"5\",\n" +
           "\t\t\"humidity\": \"50\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"86\", \"metric\": \"30\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"86\", \"metric\": \"30\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"16\",\"hour_padded\": \"16\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473192000\",\"pretty\": \"4:00 PM EDT on September 06, 2016\",\"civil\": \"4:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"24\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"179\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"3\",\n" +
           "\t\t\"humidity\": \"52\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"86\", \"metric\": \"30\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"86\", \"metric\": \"30\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"17\",\"hour_padded\": \"17\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473195600\",\"pretty\": \"5:00 PM EDT on September 06, 2016\",\"civil\": \"5:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"83\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"23\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"177\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"1\",\n" +
           "\t\t\"humidity\": \"53\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"18\",\"hour_padded\": \"18\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473199200\",\"pretty\": \"6:00 PM EDT on September 06, 2016\",\"civil\": \"6:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"22\",\n" +
           "\t\t\"wspd\": {\"english\": \"13\", \"metric\": \"21\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"180\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"54\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"84\", \"metric\": \"29\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"0\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"19\",\"hour_padded\": \"19\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473202800\",\"pretty\": \"7:00 PM EDT on September 06, 2016\",\"civil\": \"7:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"21\",\n" +
           "\t\t\"wspd\": {\"english\": \"12\", \"metric\": \"19\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"183\"},\n" +
           "\t\t\"wx\": \"Mostly Sunny\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"56\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"82\", \"metric\": \"28\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"80\", \"metric\": \"27\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"1\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"20\",\"hour_padded\": \"20\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473206400\",\"pretty\": \"8:00 PM EDT on September 06, 2016\",\"civil\": \"8:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"21\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"182\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"58\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"79\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"2\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"21\",\"hour_padded\": \"21\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473210000\",\"pretty\": \"9:00 PM EDT on September 06, 2016\",\"civil\": \"9:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"20\",\n" +
           "\t\t\"wspd\": {\"english\": \"11\", \"metric\": \"18\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"184\"},\n" +
           "\t\t\"wx\": \"Mostly Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"60\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"3\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"22\",\"hour_padded\": \"22\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473213600\",\"pretty\": \"10:00 PM EDT on September 06, 2016\",\"civil\": \"10:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"63\", \"metric\": \"17\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"19\",\n" +
           "\t\t\"wspd\": {\"english\": \"9\", \"metric\": \"14\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"S\", \"degrees\": \"191\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"61\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"78\", \"metric\": \"26\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"23\",\"hour_padded\": \"23\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"6\",\"mday_padded\": \"06\",\"yday\": \"249\",\"isdst\": \"1\",\"epoch\": \"1473217200\",\"pretty\": \"11:00 PM EDT on September 06, 2016\",\"civil\": \"11:00 PM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Tuesday\",\"weekday_name_night\": \"Tuesday Night\",\"weekday_name_abbrev\": \"Tue\",\"weekday_name_unlang\": \"Tuesday\",\"weekday_name_night_unlang\": \"Tuesday Night\",\"ampm\": \"PM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"19\",\n" +
           "\t\t\"wspd\": {\"english\": \"8\", \"metric\": \"13\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"200\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"63\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"77\", \"metric\": \"25\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"4\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"0\",\"hour_padded\": \"00\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"7\",\"mday_padded\": \"07\",\"yday\": \"250\",\"isdst\": \"1\",\"epoch\": \"1473220800\",\"pretty\": \"12:00 AM EDT on September 07, 2016\",\"civil\": \"12:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"18\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SSW\", \"degrees\": \"213\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"65\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"76\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"5\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"1\",\"hour_padded\": \"01\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"7\",\"mday_padded\": \"07\",\"yday\": \"250\",\"isdst\": \"1\",\"epoch\": \"1473224400\",\"pretty\": \"1:00 AM EDT on September 07, 2016\",\"civil\": \"1:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"18\",\n" +
           "\t\t\"wspd\": {\"english\": \"7\", \"metric\": \"11\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"224\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"67\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"75\", \"metric\": \"24\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t\t,\n" +
           "\t\t{\n" +
           "\t\t\"FCTTIME\": {\n" +
           "\t\t\"hour\": \"2\",\"hour_padded\": \"02\",\"min\": \"00\",\"min_unpadded\": \"0\",\"sec\": \"0\",\"year\": \"2016\",\"mon\": \"9\",\"mon_padded\": \"09\",\"mon_abbrev\": \"Sep\",\"mday\": \"7\",\"mday_padded\": \"07\",\"yday\": \"250\",\"isdst\": \"1\",\"epoch\": \"1473228000\",\"pretty\": \"2:00 AM EDT on September 07, 2016\",\"civil\": \"2:00 AM\",\"month_name\": \"September\",\"month_name_abbrev\": \"Sep\",\"weekday_name\": \"Wednesday\",\"weekday_name_night\": \"Wednesday Night\",\"weekday_name_abbrev\": \"Wed\",\"weekday_name_unlang\": \"Wednesday\",\"weekday_name_night_unlang\": \"Wednesday Night\",\"ampm\": \"AM\",\"tz\": \"\",\"age\": \"\",\"UTCDATE\": \"\"\n" +
           "\t\t},\n" +
           "\t\t\"temp\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"dewpoint\": {\"english\": \"64\", \"metric\": \"18\"},\n" +
           "\t\t\"condition\": \"Clear\",\n" +
           "\t\t\"icon\": \"clear\",\n" +
           "\t\t\"icon_url\":\"http://icons.wxug.com/i/c/k/nt_clear.gif\",\n" +
           "\t\t\"fctcode\": \"1\",\n" +
           "\t\t\"sky\": \"18\",\n" +
           "\t\t\"wspd\": {\"english\": \"6\", \"metric\": \"10\"},\n" +
           "\t\t\"wdir\": {\"dir\": \"SW\", \"degrees\": \"226\"},\n" +
           "\t\t\"wx\": \"Clear\",\n" +
           "\t\t\"uvi\": \"0\",\n" +
           "\t\t\"humidity\": \"70\",\n" +
           "\t\t\"windchill\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"heatindex\": {\"english\": \"-9999\", \"metric\": \"-9999\"},\n" +
           "\t\t\"feelslike\": {\"english\": \"74\", \"metric\": \"23\"},\n" +
           "\t\t\"qpf\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"snow\": {\"english\": \"0.0\", \"metric\": \"0\"},\n" +
           "\t\t\"pop\": \"6\",\n" +
           "\t\t\"mslp\": {\"english\": \"30.24\", \"metric\": \"1024\"}\n" +
           "\t\t}\n" +
           "\t]\n" +
           "}";

}
