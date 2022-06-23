package com.practice;

import com.practice.discountmode.DiscountMode;

public class Song {
    private DiscountMode mode;
    
    public void setMode(DiscountMode mode) {
        this.mode = mode;
    }
    
    public double getPrice() {
        return 10.0 * mode.rate();
    }
    
}
