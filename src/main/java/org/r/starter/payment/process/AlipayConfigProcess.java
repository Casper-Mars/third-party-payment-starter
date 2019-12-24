package org.r.starter.payment.process;

import lombok.extern.slf4j.Slf4j;
import org.r.base.payment.config.AlipayConfig;
import org.r.starter.payment.config.AlipayConfigProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author casper
 * @date 19-10-24 下午5:44
 **/
@Slf4j
@Configuration
@EnableConfigurationProperties(AlipayConfigProperties.class)
public class AlipayConfigProcess {

    @Resource
    private AlipayConfigProperties alipayConfigProperties;


    @Bean
    @ConditionalOnMissingBean(AlipayConfig.class)
    public AlipayConfig configAlipay() {
        AlipayConfig alipayConfig = new AlipayConfig();
        alipayConfig.setAppId(alipayConfigProperties.getAppId());
        alipayConfig.setAliPublicKey(alipayConfigProperties.getAliPublicKey());
        alipayConfig.setFormat(alipayConfigProperties.getFormat());
        alipayConfig.setGatewayUrl(alipayConfigProperties.getGatewayUrl());
        alipayConfig.setInputCharset(alipayConfigProperties.getInputCharset());
        alipayConfig.setOutOfTime(alipayConfigProperties.getOutOfTime());
        alipayConfig.setPartner(alipayConfigProperties.getPartner());
        alipayConfig.setPrivateKey(alipayConfigProperties.getPrivateKey());
        alipayConfig.setSellerId(alipayConfigProperties.getSellerId());
        alipayConfig.setSignType(alipayConfigProperties.getSignType());
        alipayConfig.setReturnUrl(alipayConfigProperties.getReturnUrl());
        return alipayConfig;
    }


}
