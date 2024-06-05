package com.example.domain;

public class Car {
    private Integer speed;
    private String type;

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "スピード=" + speed +
                ", type='" + type + '\'' +
                '}';
    }
}
