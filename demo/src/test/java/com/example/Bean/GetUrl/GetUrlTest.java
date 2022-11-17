package com.example.Bean.GetUrl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.*;

class GetUrlTest {

    @Autowired
    private Environment env;
    @Test
    String exec(String matchid) {
        String api_query = "?api_key=";
        String site = "https://asia.api.riotgames.com/tft/match/v1/matches/";
        String url = site + matchid + api_query + env.getProperty("api_key");
        return url;
    }
}