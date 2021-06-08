package org.example.factorymethod.factory;

import org.example.factorymethod.model.Car;
import org.example.factorymethod.model.Country;

public interface CarFactory {
    Car produceCar(Country country);
}
