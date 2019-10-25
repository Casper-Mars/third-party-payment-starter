package org.r.starter.payment;

import org.junit.jupiter.api.Test;
import org.r.base.payment.config.WechatPayConfig;
import org.r.base.payment.service.PaymentService;
import org.r.base.payment.service.impl.wechat.WechatScanPaymentServiceImpl;
import org.r.starter.payment.config.WechatConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PaymentApplicationTests {

    @Autowired
    private WechatPayConfig wechatConfigProperties;



    @Test
    void contextLoads() {

        System.out.println("sjsjjsj");



    }

}
