package com.zyg.dolphin.limiter.biz;

public interface RateLimiter {
    /**
     * 判断一个key是否可以通过
     *
     * @param key 限流的key
     * @param limit 限流的数量
     * @param windowSize 窗口大小，单位为秒
     * @return 是否通过
     */
    public Boolean tryAcquire(String key, int limit, int windowSize);
}
