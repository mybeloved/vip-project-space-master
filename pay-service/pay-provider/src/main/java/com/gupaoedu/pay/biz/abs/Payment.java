package com.gupaoedu.pay.biz.abs;

import com.gupaoedu.pay.commons.AbstractRequest;
import com.gupaoedu.pay.commons.AbstractResponse;
import com.gupaoedu.pay.exception.BizException;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public interface Payment {

    /**
     * 发起交易执行的过程
     * @param request
     * @return
     * @throws BizException
     */
    AbstractResponse process(AbstractRequest request) throws BizException;

    /**
     * 完成交易结果的处理
     * @param request
     * @return
     * @throws BizException
     */
    AbstractResponse completePayment(AbstractRequest request) throws BizException;
}
