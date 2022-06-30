package com.practice.chap03.solution2;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayCalculator {

    
    public int getPay(int x, int y) {
        int payAmount = 0;
        payAmount = 10 * x + 15 * y;
    
        return payAmount;
    }
}
