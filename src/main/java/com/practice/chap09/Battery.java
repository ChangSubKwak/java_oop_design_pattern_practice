package com.practice.chap09;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Battery {
    private int level = 100;
    
    private List<BatteryObserver> observers;
    
    public Battery() {
        observers = new ArrayList<>();
    }
    
    public void addObserver(BatteryObserver batteryObserver) {
        observers.add(batteryObserver);
    }
    
    public void consume(int amount) {
        level -= amount;
        for (BatteryObserver observer: observers) {
            observer.update();
        }
    }
    
    public int getLevel() {
        return level;
    }
}
