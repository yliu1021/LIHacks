package Wit;

/**
 * Created by albertzhang on 8/27/16.
 */

import java.io.InputStream;
import java.net.*;
public class CommandHandler {
    public static String getCommand(String command) throws Exception {

        String url = "https://api.wit.ai/message";
        String key = "GBWY5MMEU4GFJU2KM2IOBV7CVNL47CRD";

        String param1 = "20141022";
        String param2 = command;
        String charset = "UTF-8";

        String query = String.format("v=%s&q=%s",
                URLEncoder.encode(param1, charset),
                URLEncoder.encode(param2, charset));


        URLConnection connection = new URL(url + "?" + query).openConnection();
        connection.setRequestProperty ("Authorization Bearer", key);
        connection.setRequestProperty("Accept-Charset", charset);
        InputStream response = connection.getInputStream();
        return response.toString();
    }
