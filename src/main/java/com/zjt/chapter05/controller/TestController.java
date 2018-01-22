package com.zjt.chapter05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {


    @RequestMapping("/hello")
    public ModelAndView Hello(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("name","赵佳涛");
        modelAndView.addObject("message","祝你新春快乐");
        return modelAndView;
    }




}
