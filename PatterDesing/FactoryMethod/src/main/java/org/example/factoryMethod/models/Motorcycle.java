package org.example.factoryMethod.models;

import org.example.factoryMethod.Vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Run Motorcycle");
    }

    @Override
    public void stop() {
        System.out.println("Stop Motorcycle");
    }
}
