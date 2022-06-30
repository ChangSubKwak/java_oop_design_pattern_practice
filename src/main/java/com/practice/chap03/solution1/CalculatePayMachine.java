package com.practice.chap03.solution1;

import com.practice.chap03.solution1.button.Button;
import com.practice.chap03.solution1.button.CalcButton;
import com.practice.chap03.solution1.button.EndButton;
import com.practice.chap03.solution1.button.ResetButton;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatePayMachine extends JFrame implements ActionListener, DocumentListener {
    private final JLabel workingHoursLabel = new JLabel("Working Hours = ", Label.RIGHT);
    private final JLabel overTimeHoursLabel = new JLabel("Overtime Hours = ", Label.RIGHT);
    private final JLabel payAmountLabel = new JLabel("Pay Amount = ", Label.RIGHT);
    
    private final JTextField tfWorkingHours = new JTextField();
    private final JTextField tfOvertimeHours = new JTextField();
    private final JTextField tfResult = new JTextField();
    
//    private final JButton calcButton = new JButton("Calculate");
    private final JButton calcButton;
    private final JButton resetButton;
    private final JButton end;
    
    public CalculatePayMachine() {
        super("Payment Calculation");
        resetButton = new ResetButton(tfWorkingHours, tfOvertimeHours, tfResult);
        calcButton  = new CalcButton(tfWorkingHours, tfOvertimeHours, tfResult, resetButton);
        end = new EndButton();
        this.init();
        this.start();
        this.setSize(500, 250);
        this.setVisible(true);
    }
    
    public void init() {
        this.setLayout(new GridLayout(5, 1));
        Panel p = new Panel(new BorderLayout());
        p.add("West", workingHoursLabel);
        p.add("Center", tfWorkingHours);
        this.add(p);
        
        Panel p1 = new Panel(new BorderLayout());
        p1.add("West", overTimeHoursLabel);
        p1.add("Center", tfOvertimeHours);
        this.add(p1);
    
        Panel p2 = new Panel(new FlowLayout(FlowLayout.CENTER));
        p2.add("West", calcButton);
        this.add(p2);
    
        Panel p3 = new Panel(new BorderLayout());
        p3.add("West", payAmountLabel);
        p3.add("Center", tfResult);
        this.add(p3);
    
        Panel p4 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        p4.add(resetButton);
        p4.add(end);
        this.add(p4);
    }
    
    public void start() {
        calcButton.addActionListener(this);
        resetButton.addActionListener(this);
        end.addActionListener(this);
        
        tfWorkingHours.getDocument().addDocumentListener(this);
        tfOvertimeHours.getDocument().addDocumentListener(this);
        
        calcButton.setEnabled(false);
        resetButton.setEnabled(false);
    }
    
    public boolean isDataEntered() {
        if (tfWorkingHours.getText().trim().length() == 0 || tfOvertimeHours.getText().trim().length() == 0) {
            return false;
        }
        return true;
    }
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        checkData();
    }
    
    @Override
    public void removeUpdate(DocumentEvent e) {
        checkData();
    }
    
    @Override
    public void changedUpdate(DocumentEvent e) {
        checkData();
    }
    
    private void checkData() {
        calcButton.setEnabled(isDataEntered());
    }
    
    public void actionPerformed(ActionEvent e) {
//        Button button = (Button) e.getSource();
//        button.execute();
        ((Button)e.getSource()).execute();
    }
    
    public static void main(String[] args) {
        CalculatePayMachine cp = new CalculatePayMachine();
        cp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
