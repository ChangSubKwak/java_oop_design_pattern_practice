package com.practice.chap02;

import com.practice.chap02.discountmode.DiscountMode;

public class Song {
    private DiscountMode mode;
    
    public void setMode(DiscountMode mode) {
        this.mode = mode;
    }
    
    public double getPrice() {
        return 10.0 * mode.rate();
    }
    
}
