package com.practice.chap02.discountmode;

public class TodayEvent implements DiscountMode {
    @Override
    public double rate() {
        return 0.7;
    }
}
