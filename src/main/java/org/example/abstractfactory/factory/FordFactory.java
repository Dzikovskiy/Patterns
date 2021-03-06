package org.example.abstractfactory.factory;

import org.example.abstractfactory.model.Crossover;
import org.example.abstractfactory.model.FordCrossover;
import org.example.abstractfactory.model.FordSedan;
import org.example.abstractfactory.model.Sedan;

public class FordFactory implements AbstractCarFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Crossover createCrossover() {
        return new FordCrossover();
    }
}
