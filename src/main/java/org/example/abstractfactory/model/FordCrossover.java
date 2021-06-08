package org.example.abstractfactory.model;

public class FordCrossover implements Crossover{
    public static final String name = "Ford crossover";

    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FordCrossover{" +
                "name: " + name
                +
                "}";
    }
}
