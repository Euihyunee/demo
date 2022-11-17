package com.example.Controller;

import com.example.DTO.MatchID;
import com.example.Service.HistoryService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HistoryControllerTest {

    @Autowired
    HistoryService historyService;

    // puuid로 matchID받아오는 Controller
    @GetMapping(path="/puuid/{puuid}")
    public MatchID GetMatchID(@PathVariable String puuid){return historyService.GetMatchIdByPuuid(puuid);}

}