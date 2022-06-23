package com.practice.discountmode;

import com.practice.Song;

import java.util.List;
import java.util.stream.Collectors;

public class NonDiscount implements DiscountMode {
    @Override
    public double rate() {
        return 1.0;
    }
}
