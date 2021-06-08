package org.example.abstractfactory.model;

public class ToyotaCrossover implements Crossover {
    public static final String name = "Toyota crossover";

    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ToyotaCrossover{" +
                "name: " + name
                +
                "}";
    }
}
