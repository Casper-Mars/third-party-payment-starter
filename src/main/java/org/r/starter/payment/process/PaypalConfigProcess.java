package org.r.starter.payment.process;

import lombok.extern.slf4j.Slf4j;
import org.r.base.payment.config.PaypalConfig;
import org.r.base.payment.config.WechatPayConfig;
import org.r.starter.payment.config.PaypalConfigProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author casper
 * @date 19-12-24 下午4:06
 **/
@Slf4j
@Configuration
@EnableConfigurationProperties(PaypalConfigProperties.class)
public class PaypalConfigProcess {


    @Resource
    private PaypalConfigProperties config;

    @Bean
    @ConditionalOnMissingBean(PaypalConfig.class)
    public PaypalConfig get() {
        PaypalConfig paypalConfig = new PaypalConfig();
        paypalConfig.setClientId(config.getClientId());
        paypalConfig.setClientSecret(config.getClientSecret());
        paypalConfig.setCurrency(config.getCurrency());
        paypalConfig.setMode(config.getMode());
        return paypalConfig;
    }


}
