package com.springinaction.anotated.controller;

import com.springinaction.anotated.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import javax.inject.Inject;

import java.util.Map;

@Controller
public class HomeController {
    public static final int DEFAULT_SPITTLES_PER_PAGE = 25;

    @Autowired
    private SpitterService spitterService;

    @RequestMapping({"/","/home"})
    public String showHomePage(Map<String, Object> model) {
        model.put("spitters", spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
        return "home";
    }

}
