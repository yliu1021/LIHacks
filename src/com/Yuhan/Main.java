package com.Yuhan;

import bot.*;
import weather.WeatherRequest;
import yelp.YelpRequest;

public class Main {

    public static void main(String[] args) {

        System.out.println(YelpRequest.getYelpJson("pizza", "Great Neck"));

//        DiscordBot.start();

    }
}
