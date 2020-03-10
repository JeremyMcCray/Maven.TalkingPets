package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        infoStorage infoStorage = new infoStorage();
        ArrayList<String> allPetNames = new ArrayList<String>();
        System.out.println("How many pets do you have?");
        int numOfpets = scanner.nextInt();
        infoStorage.setNumberOfPets(numOfpets);
        System.out.println("What are the names of your pets");

        int counter = 0;
        do {
            String petname;
            do {
              petname = scanner.nextLine();
            }while(infoStorage.checkPetType(petname) == null);

            allPetNames.add(petname);

            infoStorage.setAPet(petname,infoStorage.checkPetType(petname));
            counter++;

            infoStorage.setNameOfPets(allPetNames);

        }while (counter < numOfpets);

        infoStorage.returnAllPets();
    }

}
