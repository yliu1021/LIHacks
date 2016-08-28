package yelp;

import json.JSONArray;
import json.JSONObject;

/**
 * Created by Yuhan on 8/28/16.
 */
public class Yelp {

    public static String getBusinesses(String term, String location) {
        String result = "";
        JSONObject jsonObject = YelpRequest.getYelpJson(term, location);

        JSONArray businesses = jsonObject.getJSONArray("businesses");
        int length = businesses.length();
        for (int i = 0; i < length; ++i) {
            JSONObject business = businesses.getJSONObject(i);

            result += business.getString("name") + "\n";
            result += "\tDescription: " + business.getString("snippet_text");
            result += "\tURL: " + business.getString("url");
            result += "\tPhone: " + business.getString("display_phone") + "\n";
            result += "\tRating: " + business.getDouble("rating") + "/5" + "\n";
            JSONArray address = business.getJSONObject("location").getJSONArray("address");
            if (address.length() > 0)
                result += "\tAddress:\n";
            for (int j = 0; j < address.length(); ++j) {
                result += "\t\t" + address.getString(j) + "\n";
            }

            if (business.keySet().contains("deals")) {
                result += "\tDeals: " + "\n";
                JSONArray deals = business.getJSONArray("deals");
                for (int j = 0; j < deals.length(); ++j) {
                    result += "\t\t" + deals.getJSONObject(j).getString("title") + "\n";
                    result += "\t\t\t" + deals.getJSONObject(j).getString("what_you_get") + "\n";
                }
            }

            if (business.keySet().contains("gift_certificates")) {
                result += "\tGift Certificates:" + "\n";
                JSONArray giftCertificates = business.getJSONArray("gift_certificates");
                for (int j = 0; j < giftCertificates.length(); ++j) {
                    JSONObject cert = giftCertificates.getJSONObject(j);
                    result += "\t\t" + cert.getString("url") + "\n";
                    for (int k = 0; k < cert.getJSONArray("options").length(); ++k) {
                        JSONObject options = cert.getJSONArray("options").getJSONObject(k);
                        result += "\t\t\t" + options.getString("formatted_price") + "\n";
                    }
                }
            }

            if (business.keySet().contains("menu_provider"))
                result += "Menu provider: " + business.getString("menu_provider") + "\n";
            if (business.keySet().contains("reservation_url"))
                result += "Reservation: " + business.getString("reservation_url") + "\n";
            result += "\n";
        }

        return result;
    }

}
