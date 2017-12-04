package com.bricerising.spring.multitenency.SpringMultiTenency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.embedded.RedisServer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;

@Component
public class EmbeddedRedisCache {

    @Autowired
    private RedisCacheConfiguration redisCacheConfiguration;

    private RedisServer redisServer;

    @PostConstruct
    public void start() throws IOException{
        redisServer = new RedisServer(redisCacheConfiguration.getPort());
        redisServer.start();
    }

    @PreDestroy
    public void stop() {
        redisServer.stop();
    }

}
