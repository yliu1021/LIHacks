package com.Yuhan;

import bot.*;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.api.*;

public class Main {

    private static String token = "MjE5Mjk2NzA2MzA1NDU4MTc2.CqProw.WVtuEQYTVTkuvy2e2PTE6-E5nrE";

    public static void main(String[] args) {

        IDiscordClient client;
        try {
            client = new ClientBuilder().withToken(token).login();
        } catch (DiscordException e) {
            return;
        }

        DiscordBot bot = new DiscordBot(client);

    }
}
