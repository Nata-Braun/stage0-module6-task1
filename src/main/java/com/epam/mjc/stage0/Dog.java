package com.epam.mjc.stage0;

public class Dog extends Animal{

    public Dog(String color, int numberOfPaws, boolean hasFur) throws IllegalArgumentException {
        super("brown", 4, true);
        getDescription();
    }
}
