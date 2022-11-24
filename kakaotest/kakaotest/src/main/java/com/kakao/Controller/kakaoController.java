package com.kakao.Controller;

import com.kakao.Model.DTO.KakaoApi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;


@RestController
public class kakaoController {

    KakaoApi kakaoApi = new KakaoApi();

    @RequestMapping(value = "/login")
    public ModelAndView login(@RequestParam("code") String code, HttpSession session){
        ModelAndView mav = new ModelAndView();
        // 1번 인증코드 요청 전달
        String access_token = kakaoApi.getAccessToken(code);
        System.out.println("1==============================");
        // 2번 인증코드로 토큰 전달
        HashMap<String, Object> userInfo = kakaoApi.getUserInfo(access_token);

        System.out.println("login info : " + userInfo.toString());

        if (userInfo.get("email") != null) {
            session.setAttribute("userId", userInfo.get("email"));
            session.setAttribute("access_token", access_token);
        }
        mav.addObject("userId", userInfo.get("email"));
        mav.setViewName("index");

        return mav;
    }


}
