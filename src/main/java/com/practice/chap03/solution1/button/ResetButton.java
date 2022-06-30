package com.practice.chap03.solution1.button;

import javax.swing.*;

public class ResetButton extends Button {
    private JTextField tfWorkingHours;
    private JTextField tfOvertimeHours;
    private JTextField tfResult;
    
    public ResetButton(JTextField tfWorkingHours, JTextField tfOvertimeHours, JTextField tfResult) {
        super.setText("Reset");
        this.tfWorkingHours = tfWorkingHours;
        this.tfOvertimeHours = tfOvertimeHours;
        this.tfResult = tfResult;
    }
    
    @Override
    public void execute() {
        System.out.println("ResetButton");
        tfWorkingHours.setText("");
        tfOvertimeHours.setText("");
        tfWorkingHours.requestFocus();
        tfResult.setText("");
        this.setEnabled(false);
    }
}
