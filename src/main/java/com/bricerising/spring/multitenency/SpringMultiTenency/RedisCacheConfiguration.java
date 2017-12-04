package com.bricerising.spring.multitenency.SpringMultiTenency;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisCacheConfiguration {

    @Value("${spring.redis.port}")
    private int port;

    public int getPort() {
        return port;
    }
}
