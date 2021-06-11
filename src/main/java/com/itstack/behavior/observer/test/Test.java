package com.itstack.behavior.observer.test;

import com.itstack.behavior.observer.LotteryResult;
import com.itstack.behavior.observer.LotteryService;
import com.itstack.behavior.observer.LotteryServiceImpl;

/**
 * @author raito
 * @date 2021/06/11
 */
public class Test {

    public static void main(String[] args) {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult  result         = lotteryService.draw("2765789109876");
        System.out.println("测试结果：" + result.getMsg());
    }

}
