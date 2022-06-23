package com.practice.chap02;

import java.util.ArrayList;
import java.util.List;

public class CartForSongs {
    List<Song> cart = new ArrayList<>();
    
    public double calculateTotalPrice() {
        return cart.stream()
            .mapToDouble(Song::getPrice)
            .sum();
    }
    
    public void add(Song song) {
        cart.add(song);
    }
}
