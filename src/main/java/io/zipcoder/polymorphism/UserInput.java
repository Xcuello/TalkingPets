package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

    List<Pet> listOfPets;
    Scanner scanner = new Scanner(System.in);

    private int numOfPets;

    public void setNumOfPets() {

        System.out.println("How many pets do you have?");

        this.numOfPets = scanner.nextInt();
    }

    public int getNumOfPets() {

        return numOfPets;

    }

    public void setPetNames() {

        Pet pet;

        listOfPets = new ArrayList<Pet>();

        for (int i = 1; i <= numOfPets; i++) {

            System.out.println("What kind of pet is it?");
            String petType = scanner.next();

            if (petType.toLowerCase().equals("dog")) {

                pet = new Dog();

                System.out.println("what is it's name?");
                pet.setNameOfPet(scanner.next());
                listOfPets.add(pet);
            } else if(petType.toLowerCase().equals("cat")) {

                pet = new Cat();

                System.out.println("what is it's name?");
                pet.setNameOfPet(scanner.next());
                listOfPets.add(pet);

            } else if (petType.toLowerCase().equals("lion")) {

                pet = new Lion();

                System.out.println("what is it's name?");
                pet.setNameOfPet(scanner.next());
                listOfPets.add(pet);
            }
        }
    }
        public List<Pet> getListOfPets () {

        return listOfPets;

        }

    }
