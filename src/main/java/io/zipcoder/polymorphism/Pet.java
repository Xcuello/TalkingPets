package io.zipcoder.polymorphism;

public abstract class Pet {

    private String nameOfPet;

    public String getNameOfPet() {

        return nameOfPet;
    }

    public void setNameOfPet(String nameOfPet) {

        this.nameOfPet = nameOfPet;
    }

    public abstract String speak();

}
