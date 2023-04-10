package com.example.p0021classpractice;

import androidx.annotation.NonNull;

public class CPU extends Hardware {
    private int cores;
    private double speed;

    public CPU(String name, String type, double price, int cores, double speed) {
        super(name, type, price);
        this.cores = cores;
        this.speed = speed;
    }

    public int getCores() {
        return cores;
    }

    public double getSpeed() {
        return speed;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @NonNull
    @Override
    public String toString(){
        return getName() + "\n(" + "Type: " + getType() + ", " + getCores() + " cores, " + getSpeed() + " GHz, " + getPrice() + "$)";
    }
}
