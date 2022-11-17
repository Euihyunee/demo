package com.example.Service;

import com.example.Bean.GetMatchIDBean;
import com.example.DTO.MatchID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryService {

    @Autowired
    GetMatchIDBean GetMatchIDBean;

    public MatchID GetMatchIdByPuuid(String puuid){
        return GetMatchIDBean.exec(puuid);
    }
}

