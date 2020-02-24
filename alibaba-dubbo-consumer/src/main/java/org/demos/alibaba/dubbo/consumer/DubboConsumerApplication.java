package org.demos.alibaba.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Version:
 * @Date: 2020/2/22
 * @Company: ruixiaoyun.ltd
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
