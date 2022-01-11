package com.cinand.vaselin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liuwenping on 2022/1/9.
 */
@RestController
@Slf4j
@RequestMapping("/fsu/vaselin/web/v0.1/")
public class VaselinWebController {
    /**
     * 首页
     * @return
     */
    @RequestMapping("home")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("/home");
        return mav;
    }


}
