package com.practice.chap09;

public class BatteryClient {
    public static void main(String[] args) {
        Battery battery = new Battery();
    
        battery.addObserver(new BatteryLevelDisplay(battery));
        battery.addObserver(new LowBatteryWarning(battery));
        
        battery.consume(20);
        battery.consume(50);
        battery.consume(10);
    }
}
