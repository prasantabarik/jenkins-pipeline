package com.kodcu.controller;

/*
 * Created by debd on 23/11/2017
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;


@Controller
public class WelcomePageController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    //@Autowired
    //private RestTemplate restTemplate;
    public String getPage(){
        final String uri = "http://localhost:3500/v1.0/invoke/jenkinstestnew.fromghnew/method/";

    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(uri, String.class);
//added dar secret store
    System.out.println(result);
     final String uri1 = "http://localhost:3500/v1.0/secrets/kubernetes/jenkinssecret?metadata.namespace=default";

    RestTemplate restTemplate1 = new RestTemplate();
    String result1 = restTemplate1.getForObject(uri1, String.class);

    System.out.println(result1);
        return "index";
    }
}
