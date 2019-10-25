package org.r.starter.payment.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author casper
 * @date 19-10-24 下午5:34
 **/
@Data
@ConfigurationProperties(prefix = "payment.wechat")
public class WechatConfigProperties {

    /**
     * appid
     */
    private String appId;
    /**
     * 应用密钥
     */
    private String appSecret;
    /**
     * 商户号
     */
    private String mchid;
    /**
     * API密钥，在商户平台设置
     */
    private String apiKey;
    /**
     * 交易类型
     */
    private String tradeType;
    /**
     * 请求地址
     */
    private String gatewayUrl;
    /**
     * 请求方法
     */
    private String requestMethod;

    /**
     * api证书位置，绝对路径
     */
    private String p12CertPath;

    /**
     * 退款地址
     */
    private String refundUrl;

}
