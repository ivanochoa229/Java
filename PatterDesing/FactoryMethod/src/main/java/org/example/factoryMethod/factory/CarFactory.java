package org.example.factoryMethod.factory;

import org.example.factoryMethod.Vehicle;
import org.example.factoryMethod.models.Car;

public class CarFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
