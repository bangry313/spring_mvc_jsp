package com.ezen.springmvc.web.api.controller;

import com.ezen.springmvc.web.member.dto.MemberDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URI;
import java.net.URL;

// API 서비스 컨트롤러
@Controller
@RequestMapping("/api")
@Slf4j
public class APIServiceController {

    @PostMapping("/v1")
    public @ResponseBody String jsonHandling(@RequestBody MemberDto memberDto){
        log.info("json -> object : {}", memberDto);
        return "Success~~~~~~~";
    }

    @PostMapping("/v2")
    public @ResponseBody MemberDto jsonHandling2(@RequestBody MemberDto memberDto){
        log.info("json -> object : {}", memberDto);
        memberDto.setRegdate("20240509");
        // DB 처리
        return memberDto;
    }

    @PostMapping("/v3")
    public ResponseEntity<MemberDto> jsonHandling3(RequestEntity<MemberDto> requestEntity){
        URI url = requestEntity.getUrl();
        HttpMethod method = requestEntity.getMethod();
        String type = requestEntity.getType().getTypeName();
        MemberDto memberDto = requestEntity.getBody();
        memberDto.setRegdate("20201010");
//        MemberDto memberDto = MemberDto.builder()
//                .id("bangry")
//                .name("김기정")
//                .email("bangry@gmail.com")
//                .build();
        return new ResponseEntity<MemberDto>(memberDto, HttpStatus.OK);
//        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }


}
