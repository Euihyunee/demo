package com.example.Controller;

import com.example.DTO.MatchID;
import com.example.Service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/his")
public class HistoryController {
    @Autowired
    HistoryService historyService;

    // puuid로 matchID받아오는 Controller
    @GetMapping(path="/puuid/{puuid}")
    public MatchID GetMatchID(@PathVariable String puuid){return historyService.GetMatchIdByPuuid(puuid);}
}
