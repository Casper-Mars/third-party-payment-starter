package org.r.starter.payment.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author casper
 * @date 19-12-24 下午4:04
 **/
@Data
@ConfigurationProperties(prefix = "payment.paypal")
public class PaypalConfigProperties {

    /**
     * appId
     */
    private String clientId;
    /**
     * 密钥
     */
    private String clientSecret;
    /**
     * 接入模式,live正式,sandbox沙箱
     */
    private String mode;
    /**
     * 货币
     */
    private String currency;


}
