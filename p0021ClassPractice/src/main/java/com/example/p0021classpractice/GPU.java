package com.example.p0021classpractice;

import androidx.annotation.NonNull;

public class GPU extends Hardware {
    private int memory;
    private double clockSpeed;

    public GPU(String name, String type, int price, int memory, double clockSpeed) {
        super(name, type, price);
        this.memory = memory;
        this.clockSpeed = clockSpeed;
    }

    public int getMemory() {
        return memory;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @NonNull
    @Override
    public String toString(){
        return getName() + "\n(" + "Type: " + getType() + ", " + getMemory() + " GB, " + getClockSpeed() + " MHz, " + getPrice() + "$)";
    }
}
