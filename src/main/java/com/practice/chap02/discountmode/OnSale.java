package com.practice.chap02.discountmode;

public class OnSale implements DiscountMode {
    @Override
    public double rate() {
        return 0.9;
    }
}
