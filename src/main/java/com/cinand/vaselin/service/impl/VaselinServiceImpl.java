package com.cinand.vaselin.service.impl;

import com.cinand.vaselin.service.VaselinService;
import lombok.extern.slf4j.Slf4j;
import org.cinand.config.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by liuwenping on 2022/1/9.
 */
@Service
@Slf4j
public class VaselinServiceImpl implements VaselinService {

    @Autowired
    private Sample sample;

    @Override
    public String hello() {
        log.error("Oh,a excepted error~~~");
        return "hello:"+sample.getName()+", you are "+sample.getAge()+" years old";
    }
}
