package org.r.starter.payment.process;

import lombok.extern.slf4j.Slf4j;
import org.r.base.payment.config.WechatPayConfig;
import org.r.starter.payment.config.WechatConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author casper
 * @date 19-10-24 下午5:38
 **/
@Slf4j
@Configuration
@EnableConfigurationProperties(WechatConfigProperties.class)
public class WechatConfigProcess {


    @Resource
    private WechatConfigProperties wechatConfigProperties;


    @Bean
    @ConditionalOnMissingBean(WechatPayConfig.class)
    public WechatPayConfig configWechat() {
        WechatPayConfig wechatPayConfig = new WechatPayConfig();
        wechatPayConfig.setApiKey(wechatConfigProperties.getApiKey());
        wechatPayConfig.setAppId(wechatConfigProperties.getAppId());
        wechatPayConfig.setAppSecret(wechatConfigProperties.getAppSecret());
        wechatPayConfig.setGatewayUrl(wechatConfigProperties.getGatewayUrl());
        wechatPayConfig.setMchid(wechatConfigProperties.getMchid());
        wechatPayConfig.setP12CertPath(wechatConfigProperties.getP12CertPath());
        wechatPayConfig.setTradeType(wechatConfigProperties.getTradeType());
        wechatPayConfig.setRefundUrl(wechatConfigProperties.getRefundUrl());
        wechatPayConfig.setRequestMethod(wechatConfigProperties.getRequestMethod());
        return wechatPayConfig;
    }


}
