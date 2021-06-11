package com.itstack.behavior.observer.event.listener;

import com.itstack.behavior.observer.LotteryResult;

/**
 * @author raito
 * @date 2021/06/11
 */
public class MessageEventListener implements EventListener {


    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("给用户 " + result.getuId() + "发送短信通知(短信)：" + result.getMsg());
    }

}
