package org.example.abstractfactory;

import org.example.abstractfactory.factory.AbstractCarFactory;
import org.example.abstractfactory.factory.FordFactory;
import org.example.abstractfactory.factory.ToyotaFactory;

public class Main {
    public static void main(String[] args) {
        AbstractCarFactory abstractCarFactory1 = new ToyotaFactory();
        AbstractCarFactory abstractCarFactory2 = new FordFactory();

        System.out.println("toyota factory crossover: " + abstractCarFactory1.createCrossover());
        System.out.println("ford factory sedan: " + abstractCarFactory2.createSedan());

    }
}
