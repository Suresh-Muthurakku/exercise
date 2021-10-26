package com.exercise.kafkapublisher.controller;

import lombok.Generated;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/twitter")
public class TwitterController {

    @GetMapping("/tweets")
    @ResponseStatus(HttpStatus.OK)
    public void getTweets(){

    }
}
