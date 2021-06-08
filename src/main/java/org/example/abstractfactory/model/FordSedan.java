package org.example.abstractfactory.model;

public class FordSedan implements Sedan {
    public static final String name = "Ford sedan";

    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FordSedan{" +
                "name: " + name
                +
                "}";
    }
}
