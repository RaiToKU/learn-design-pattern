package com.itstack.behavior.strategic.event;

import com.itstack.behavior.strategic.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author raito
 * @date 2021/06/11
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {

    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
