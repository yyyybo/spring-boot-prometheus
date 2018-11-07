package com.xb.prometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 入口: 普罗米修斯
 *
 * @author 莫问
 * @date 2019-11-07
 */
@SpringBootApplication
public class PrometheusApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrometheusApplication.class, args);
    }
}
