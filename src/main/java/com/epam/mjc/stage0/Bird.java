package com.epam.mjc.stage0;

public class Bird extends Animal{



    public Bird() throws IllegalArgumentException {
        super("blue", 2, false);
        getDescription();
    }


    @Override
    public String getDescription() {
        String patternAnimals;
        String paws;
        String fur;
        if (getNumberOfPaws() == 1) {
            paws = Integer.toString(getNumberOfPaws()) + " paw";
        } else {
            paws = Integer.toString(getNumberOfPaws()) + " paws";
        }
        if (isHasFur()) {
            fur = "a fur";
        } else {
            fur = "no fur";
        }
        patternAnimals = "This animal is mostly " + getColor() + ". It has " + paws + " and " + fur + ". Moreover, it has 2 wings and can fly.";
        System.out.println(patternAnimals);
        return patternAnimals;
    }



}
