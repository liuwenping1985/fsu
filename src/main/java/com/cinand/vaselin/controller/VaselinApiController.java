package com.cinand.vaselin.controller;

import com.cinand.fsu.annotation.FsuRequest;
import com.cinand.vaselin.service.VaselinService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Vaselin Controller
 * (万金油的意思，但凡士林不是万金油)
 *
 * @author liuwenping
 */
@RestController
@Slf4j
@FsuRequest
@RequestMapping("/fsu/vaselin/api/v0.1/")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class VaselinApiController {

    @Autowired
    private VaselinService vselinService;

    @RequestMapping("hello")
    public String hello() {
        log.info("hello is invoked!");
        return vselinService.hello();
    }

}
