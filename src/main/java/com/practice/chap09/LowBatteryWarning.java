package com.practice.chap09;

public class LowBatteryWarning extends BatteryObserver {
    private static final int LOW_BATTERY = 30;
    public LowBatteryWarning(Battery battery) {
        super(battery);
    }
    
    public void update() {
        int level = battery.getLevel();
        if (level < LOW_BATTERY) {
            System.out.println("<Warning> Low Battery: " + level + " Compared with " + LOW_BATTERY);
        }
    }
}
