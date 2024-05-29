package com.example.parkingsystem.domain.model.service;

import com.example.parkingsystem.domain.model.client.Client;

public abstract class Service {
    protected double value;
    protected double time;
    protected double toleranceTime;

    public abstract double calculateBilling();

    public Service(double value, double time, double toleranceTime) {
        this.value = value;
        this.time = time;
        this.toleranceTime = toleranceTime;
    }

    public double getValue() {
        return value;
    }

    public double getTime() {
        return time;
    }

    public double getToleranceTime() {
        return toleranceTime;
    }
}
