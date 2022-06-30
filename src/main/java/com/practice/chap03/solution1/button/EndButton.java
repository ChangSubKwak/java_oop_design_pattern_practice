package com.practice.chap03.solution1.button;

public class EndButton extends Button {
   
    public EndButton() {
        super.setText("End");
    }
    @Override
    public void execute() {
        System.out.println("Stop");
        System.exit(0);
    }
}
