package org.example.normalFactory;

import org.example.normalFactory.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.createVehicle(TypeOfVehicle.CAR.name());
        car.start();
        car.stop();
        Vehicle plane = vehicleFactory.createVehicle(TypeOfVehicle.PLANE.name());
        plane.start();
        plane.stop();
    }
}