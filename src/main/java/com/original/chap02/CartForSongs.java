package com.original.chap02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CartForSongs {
    List<Song> cart = new ArrayList<>();
    
    public double calculateTotalPrice() {
        double total = 0.0;
        Iterator<Song> itr = cart.iterator();
        
        while (itr.hasNext()) {
            Song s = itr.next();
            
            if (s.getDiscountMode().equals("OnSale")) {
                total += 0.9 * s.getPrice();
            }
            else if (s.getDiscountMode().equals("TodayEvent")) {
                total += 0.7 * s.getPrice();
            }
            else {
                total += s.getPrice();
            }
            System.out.println("total = " + total);
        }
        
        return total;
    }
    
    public void add(Song song) {
        cart.add(song);
    }
}
