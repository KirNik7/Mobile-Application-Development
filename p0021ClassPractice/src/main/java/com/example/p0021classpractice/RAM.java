package com.example.p0021classpractice;

import androidx.annotation.NonNull;

public class RAM extends Hardware {
    private int size;
    private double speed;

    public RAM(String name, String type, double price, int size, double speed) {
        super(name, type, price);
        this.size = size;
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @NonNull
    @Override
    public String toString(){
        return getName() + "\n(" + "Type: " + getType() + ", " + getSize() + " GB, " + getSpeed() + " MHz, " + getPrice() + "$)";
    }
}
