package com.itstack.behavior.observer.event.listener;

import com.itstack.behavior.observer.LotteryResult;

/**
 * @author raito
 * @date 2021/06/11
 */
public interface EventListener {

    void doEvent(LotteryResult result);

}
