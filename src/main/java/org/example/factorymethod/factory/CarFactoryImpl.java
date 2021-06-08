package org.example.factorymethod.factory;

import org.example.factorymethod.model.Car;
import org.example.factorymethod.model.Country;
import org.example.factorymethod.model.Ford;
import org.example.factorymethod.model.Toyota;

public class CarFactoryImpl implements CarFactory {

    @Override
    public Car produceCar(Country country) {
        if (country.equals(Country.USA)) {
            return new Ford();
        }
        if (country.equals(Country.JAPAN)) {
            return new Toyota();
        }

        return null;
    }
}
