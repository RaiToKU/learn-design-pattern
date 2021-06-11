package com.itstack.behavior.strategic.test;

import com.itstack.behavior.strategic.Context;
import com.itstack.behavior.strategic.event.MJCouponDiscount;
import com.itstack.behavior.strategic.event.NYGCouponDiscount;
import com.itstack.behavior.strategic.event.ZJCouponDiscount;
import com.itstack.behavior.strategic.event.ZKCouponDiscount;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author raito
 * @date 2021/06/11
 */
public class Test {

    public static void main(String[] args) {
        //直减
        test_zj();
        //满减
        test_mj();
        //折扣
        test_zk();
        //n元购
        test_nyg();

    }


    public static void test_zj() {
        // 直减；100-10，商品100元
        Context<Double> context        = new Context<Double>(new ZJCouponDiscount());
        BigDecimal      discountAmount = context.discountAmount(10D, new BigDecimal(100));
        System.out.println("测试结果：直减优惠后金额" + discountAmount);
    }


    public static void test_mj() {
        // 满100减10，商品100元
        Context<Map<String, String>> context = new Context<>(new MJCouponDiscount());
        Map<String, String>          mapReq  = new HashMap<>();
        mapReq.put("x", "100");
        mapReq.put("n", "10");
        BigDecimal discountAmount = context.discountAmount(mapReq, new BigDecimal(100));
        System.out.println("测试结果：满减优惠后金额 " + discountAmount);
    }


    public static void test_zk() {
        // 折扣9折，商品100元
        Context<Double> context        = new Context<>(new ZKCouponDiscount());
        BigDecimal      discountAmount = context.discountAmount(0.9D, new BigDecimal(100));
        System.out.println("测试结果：折扣9折后金额 " + discountAmount);
    }

    public static void test_nyg() {
        // n元购；100-10，商品100元
        Context<Double> context        = new Context<>(new NYGCouponDiscount());
        BigDecimal      discountAmount = context.discountAmount(90D, new BigDecimal(100));
        System.out.println("测试结果：n元购优惠后金额 " + discountAmount);
    }

}
