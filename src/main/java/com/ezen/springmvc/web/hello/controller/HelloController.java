package com.ezen.springmvc.web.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

// /hello 요청에 대한 세부 컨트롤러(핸들러)
// POJO 클래스로 작성하면 된다.
@Slf4j
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
//        String message = xxxService.xxx();
        String message = "스프링MVC 기반의 웹애플리케이션입니다..";

        Calendar calendar = Calendar.getInstance();
        String today = String.format("%1$tF %1$tT", calendar);

        model.addAttribute("message", message);
        model.addAttribute("today", today);

        log.info("HelloController 실행됨....");
        return "hello";
    }
}
