package com.practice.chap09;

public class BatteryLevelDisplay extends BatteryObserver {
   
    public BatteryLevelDisplay(Battery battery) {
        super(battery);
    }
    
    public void update() {
        int level = battery.getLevel();
        System.out.println("Level : " + level);
    }
}
