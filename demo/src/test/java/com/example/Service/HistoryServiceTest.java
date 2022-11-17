package com.example.Service;

import com.example.Bean.GetMatchIDBean;
import com.example.DTO.MatchID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class HistoryServiceTest {
    @MockBean
    private HistoryService historyService;
    private final GetMatchIDBean getMatchIDBean = mock(GetMatchIDBean.class);
    private MatchID MatchID = new MatchID();

    @BeforeEach
    void stubbing(){

        given(getMatchIDBean.exec(any(String.class))).willReturn(MatchID);
    }
//    @InjectMocks
//    private HistoryService historyService;
//
//    @Mock
//    private MatchID matchID;
//
//    @Spy
//    private GetMatchIDBean getMatchIDBean;
//

}