package com.epam.mjc.stage0;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) throws IllegalArgumentException {
        if (color == null ) {
            throw new IllegalArgumentException();
        }
        if (numberOfPaws<=0){
            throw new IllegalArgumentException();
        }
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public String getDescription(){
        String patternAnimals;
        String paws;
        String fur;
        if (numberOfPaws==1) {
            paws = Integer.toString(numberOfPaws) + " paw";
        }else{
            paws = Integer.toString(numberOfPaws) + " paws";
        }
        if (hasFur == true) {
            fur = "a fur";
        }else{
            fur = "no fur";
        }
        patternAnimals = "This animal is mostly " + color + ". It has " + paws + " and " + fur +".";
        System.out.println(patternAnimals);
        return patternAnimals;


    }

}



