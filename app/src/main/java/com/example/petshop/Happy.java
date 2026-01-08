package com.example.petshop;
import java.util.Date;

public class Happy extends Mood{
    public Happy() {
        super();
    }

    public Happy(Date date) {
        super(date);
    }

    public String printMood() {
        return "Current mood is Happy on " + this.getDate();
    }
}
