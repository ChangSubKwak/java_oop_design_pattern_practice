package com.practice.chap03.solution1.button;

import javax.swing.*;

public class CalcButton extends Button {
    private JTextField tfWorkingHours;
    private JTextField tfOvertimeHours;
    private JTextField tfResult;
    private JButton resetButton;
    
    public CalcButton(JTextField tfWorkingHours, JTextField tfOvertimeHours, JTextField tfResult, JButton resetButton) {
        super.setText("Calculate");
        this.tfWorkingHours = tfWorkingHours;
        this.tfOvertimeHours = tfOvertimeHours;
        this.tfResult = tfResult;
        this.resetButton = resetButton;
    }
    
    @Override
    public void execute() {
        System.out.println("CalcButton");
        int x = 0;
        try {
            x = Integer.parseInt(tfWorkingHours.getText().trim());
        } catch (NumberFormatException ee) {
            tfWorkingHours.setText("");
            tfWorkingHours.requestFocus();
            return;
        }
    
        int y = 0;
        try {
            y = Integer.parseInt(tfOvertimeHours.getText().trim());
        } catch (NumberFormatException ee) {
            tfOvertimeHours.setText("");
            tfWorkingHours.requestFocus();
            return;
        }
    
        int payAmount = 0;
        payAmount = 10 * x + 15 * y;
    
        tfResult.setText(String.valueOf(payAmount));
        resetButton.setEnabled(true);
    }
}
