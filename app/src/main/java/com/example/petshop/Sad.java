package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{
    public Sad() {
        super();
    }

    public Sad(Date date) {
        super(date);
    }

    public String printMood() {
        return "Current mood is Sad on " + getDate();
    }

}
