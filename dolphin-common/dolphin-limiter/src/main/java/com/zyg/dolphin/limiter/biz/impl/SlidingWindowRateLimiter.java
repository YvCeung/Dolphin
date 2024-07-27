package com.zyg.dolphin.limiter.biz.impl;

import com.zyg.dolphin.limiter.biz.RateLimiter;
import org.redisson.api.RRateLimiter;
import org.redisson.api.RateIntervalUnit;
import org.redisson.api.RateType;
import org.redisson.api.RedissonClient;

/**
 * 基于redis的滑动窗口限流
 */
public class SlidingWindowRateLimiter implements RateLimiter {

    private RedissonClient redissonClient;

    //定义key的前缀,具体key的传递由业务指定，所以此模块中不在定义constant包
    private static final String LIMIT_KEY_PREFIX = "dolphin:window:limit:";

    public SlidingWindowRateLimiter(RedissonClient redissonClient) {
        this.redissonClient = redissonClient;
    }
    @Override
    public Boolean tryAcquire(String key, int limit, int windowSize) {
        //底层是redis的zset实现滑动窗口的原理
        RRateLimiter rateLimiter = redissonClient.getRateLimiter(LIMIT_KEY_PREFIX + key);

        if(!rateLimiter.isExists()){
            //整个应用系统的限制速率
            rateLimiter.trySetRate(RateType.OVERALL, limit, windowSize, RateIntervalUnit.SECONDS);
        }

        return rateLimiter.tryAcquire();
    }
}
