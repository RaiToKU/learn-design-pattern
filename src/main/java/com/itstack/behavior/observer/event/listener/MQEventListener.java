package com.itstack.behavior.observer.event.listener;

import com.itstack.behavior.observer.LotteryResult;

/**
 * @author raito
 * @date 2021/06/11
 */
public class MQEventListener implements EventListener {

    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("记录用户 " + result.getuId() + " 摇号结果(MQ)：" + result.getMsg());
    }
}
