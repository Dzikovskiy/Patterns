package org.example.abstractfactory.factory;

import org.example.abstractfactory.model.Crossover;
import org.example.abstractfactory.model.Sedan;
import org.example.abstractfactory.model.ToyotaCrossover;
import org.example.abstractfactory.model.ToyotaSedan;

public class ToyotaFactory implements AbstractCarFactory {
    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Crossover createCrossover() {
        return new ToyotaCrossover();
    }
}
