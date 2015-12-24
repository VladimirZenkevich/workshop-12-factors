package com.altoros.stock.resources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by uladzimir.ziankevich on 12/7/2015.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.altoros.stock.domain.model")
@EntityScan(basePackages = "com.altoros.stock.domain.model")
@EnableRedisHttpSession
public class StockSpringBootStarter {

    public static void main(String[] args) {
        SpringApplication.run(StockSpringBootStarter.class, args);
    }

}
