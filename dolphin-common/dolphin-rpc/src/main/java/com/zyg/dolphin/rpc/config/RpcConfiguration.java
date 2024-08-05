package com.zyg.dolphin.rpc.config;

import com.zyg.dolphin.rpc.facade.FacadeAspect;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Rpc 配置
 *
 * @author zy
 */
@EnableDubbo
@Configuration
public class RpcConfiguration {

    @Bean
    public FacadeAspect facadeAspect() {
        return new FacadeAspect();
    }
}
