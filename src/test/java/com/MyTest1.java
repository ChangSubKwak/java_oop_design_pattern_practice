package com;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

class MyTest1 {
    @Test
    void test1() {
        int count = Integer.MAX_VALUE / 10;
        List<Integer> list = new ArrayList<>();
        Instant start = Instant.now();
        for (int i = 0; i < count; i++) {
            list.add(1);
        }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("timeElapsed.toMillis() = " + timeElapsed.toMillis());
        
        list.clear();
        list = new ArrayList<>(count);
        start = Instant.now();
        for (int i = 0; i < count; i++) {
            list.add(1);
        }
        end = Instant.now();
        timeElapsed = Duration.between(start, end);
        System.out.println("timeElapsed.toMillis() = " + timeElapsed.toMillis());
    }
}
