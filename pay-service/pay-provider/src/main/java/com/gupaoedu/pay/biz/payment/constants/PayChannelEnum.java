package com.gupaoedu.pay.biz.payment.constants;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public enum PayChannelEnum {

    ALI_PAY("alipay","微信支付渠道"),
    WECHAT_PAY("wechat_pay","微信支付渠道");

    private String code;

    private String desc;

    PayChannelEnum(String code, String desc){
        this.code=code;
        this.desc=desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
