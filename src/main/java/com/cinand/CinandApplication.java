package com.cinand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动类，默认开启事务
 * Created by liuwenping on 2022/1/8.
 * @author wiper.liu
 */
@SpringBootApplication
@EnableTransactionManagement
public class CinandApplication {
    private static class Holder {
        private static ApplicationContext applicationContext;
    }

    public static void main(String[] args) {
        Holder.applicationContext = SpringApplication.run(CinandApplication.class, args);
    }

    public static ApplicationContext getApplicationContext() {
        return Holder.applicationContext;
    }

}
