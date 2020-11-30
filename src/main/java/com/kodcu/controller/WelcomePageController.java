package com.kodcu.controller;

/*
 * Created by hakdogan on 23/11/2017
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomePageController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getPage(){
        final String uri = "http://localhost:3500/v1.0/invoke/multiplyapp/method/multiply";

    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(uri, String.class);

    System.out.println(result);
        return "index";
    }
}
