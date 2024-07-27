package com.zyg.dolphin.cache.config;

import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.context.annotation.Configuration;

@Configuration
//JetCache 框架中的一个注解，用于启用方法级别的缓存
@EnableMethodCache(basePackages = "com.zyg.dolphin")
public class CacheConfiguration {

}
