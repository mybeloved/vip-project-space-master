package com.gupaoedu.activity.services.processor.reward;

import com.gupaoedu.activity.services.processor.AbstractRewardProcessor;
import com.gupaoedu.activity.services.processor.ActivityDrawContext;
import com.gupaoedu.activity.services.processor.constants.DrawContants;
import org.springframework.stereotype.Service;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
@Service("jdCardRewardProcessor")
public class JdCardRewardProcessor extends AbstractRewardProcessor {

    protected void processor(ActivityDrawContext activityDrawContext) {
        logger.info("用户:{},获得奖项:{}",activityDrawContext.getActivityTurntableDrawReq().getUid(),activityDrawContext.getActDrawAwardItem().getItemName());
        //发放奖品
        //redisTemplate.opsForList.rpop(); //从队列中弹出奖品
        modifyAwardRecord(activityDrawContext); //保存记录
    }

    protected void afterProcessor(ActivityDrawContext activityDrawContext) {
        //发送短信

    }

    protected int getAwardType() {
        return DrawContants.AWARD_TYPE_ENUM.JD_CARD.getValue();
    }
}
