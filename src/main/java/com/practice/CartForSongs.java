package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
