package org.example.abstractfactory.model;

public class ToyotaSedan implements Sedan {
    public static final String name = "Toyota sedan";

    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ToyotaSedan{" +
                "name: " + name
                +
                "}";
    }
}
