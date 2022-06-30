package com.practice.chap09;

public abstract class BatteryObserver {
    protected Battery battery;
    
    public BatteryObserver(Battery battery) {
        this.battery = battery;
    }
    public abstract void update();
}
