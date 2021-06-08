package org.example.factorymethod;

import org.example.factorymethod.factory.CarFactory;
import org.example.factorymethod.factory.CarFactoryImpl;
import org.example.factorymethod.model.Country;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactoryImpl();
        System.out.println(carFactory.produceCar(Country.USA));
        System.out.println(carFactory.produceCar(Country.JAPAN));

    }
}
