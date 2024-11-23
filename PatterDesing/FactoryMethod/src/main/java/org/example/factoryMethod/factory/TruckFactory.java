package org.example.factoryMethod.factory;

import org.example.factoryMethod.Vehicle;
import org.example.factoryMethod.models.Truck;

public class TruckFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
