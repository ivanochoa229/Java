package org.example.factoryMethod.factory;

import org.example.factoryMethod.Vehicle;
import org.example.factoryMethod.models.Motorcycle;

public class MotorcycleFactory extends VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
