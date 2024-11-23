package org.example.factoryMethod;

import org.example.factoryMethod.factory.CarFactory;
import org.example.factoryMethod.factory.PlaneFactory;
import org.example.factoryMethod.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.start();
        car.stop();
        VehicleFactory planeFactory = new PlaneFactory();
        Vehicle plane = planeFactory.createVehicle();
        plane.start();
        plane.stop();
    }
}
