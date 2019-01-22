package io.zipcoder.polymorphism;

import java.util.List;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {


    public static void main (String[] args) {

        UserInput ui = new UserInput();

        ui.setNumOfPets();
        ui.setPetNames();
        System.out.println(ui.getListOfPets());
        List<Pet> pets = ui.getListOfPets();

        for (Pet p : pets) {

            p.speak();
            p.getNameOfPet();

            System.out.println(p.getNameOfPet() + ": " + p.speak());


        }

    }
}
