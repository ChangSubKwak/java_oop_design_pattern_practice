package com.practice.chap02.discountmode;

public class NonDiscount implements DiscountMode {
    @Override
    public double rate() {
        return 1.0;
    }
}
