package com.springinaction.anotated.controller;

import com.springinaction.anotated.domain.Spitter;
import com.springinaction.anotated.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @Autowired
    private SpitterService spitterService;

    @RequestMapping(value="/spittles", method=GET)
    public String listSpittlesForSpitter(@RequestParam(value = "spitter", required = false) String username, Model model) {
//        Spitter spitter = spitterService.getSpitter(username);
//        model.addAttribute(spitter);
//        model.addAttribute(spitterService.getSpittlesForSpitter(username));
        return "spittles/list";
    }

    @RequestMapping(method=GET, params="new")
    public String createSpitterProfile(Model model) {
        model.addAttribute(new Spitter());
        return "spitters/edit";
    }

    @RequestMapping(method= RequestMethod.POST)
    public String addSpitterFromForm(@Valid Spitter spitter,
                                     BindingResult bindingResult,
                                     @RequestParam(value="image", required=false) MultipartFile image) {
        if(bindingResult.hasErrors()) {
            //todo find out why this doesn't work
            return "spitters/edit";
        }
        spitterService.saveSpitter(spitter);
        try {
            if(!image.isEmpty()) {
                validateImage(image);
//                todo saveImage
            }
        } catch (Exception e) {
            bindingResult.reject(e.getMessage());
//            return "spitters/edit";
        }

        return "redirect:/home";
    }

    private void validateImage(MultipartFile image) {
        if(!image.getContentType().equals("image/jpeg")) {
            throw new RuntimeException("Only JPG images accepted");
        }
    }



}
