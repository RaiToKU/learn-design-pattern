package com.itstack.behavior.observer;


import com.itstack.behavior.observer.event.MinibusTargetService;

import java.util.Date;

/**
 * @author raito
 * @date 2021/06/11
 */
public class LotteryServiceImpl extends LotteryService {

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }


}
