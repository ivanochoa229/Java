package org.example.factoryMethod.factory;

import org.example.factoryMethod.Vehicle;
import org.example.factoryMethod.models.Plane;

public class PlaneFactory extends VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}
