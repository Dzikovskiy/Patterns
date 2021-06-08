package org.example.abstractfactory.factory;

import org.example.abstractfactory.model.Crossover;
import org.example.abstractfactory.model.Sedan;

public interface AbstractCarFactory {
    Sedan createSedan();

    Crossover createCrossover();
}
