package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class infoStorage {
    int numberOfPets=0;
    ArrayList<String> nameOfPets = new ArrayList<String>();
    Map<String,Pets> allThePets = new HashMap<String, Pets>();
    public infoStorage(){
    }

    public void setNumberOfPets(int numberOfPets){
        this.numberOfPets = numberOfPets;
    }

    public void setNameOfPets(ArrayList<String> allPetNames){
        this.nameOfPets=allPetNames;
    }

    public void setAPet(String petname,Pets petType){
        allThePets.put(petname,petType);
    }

    public Pets checkPetType(String petType){
        if(petType.toLowerCase().equals("dog")){
            Dog dog = new Dog();
            return dog;
        } else if (petType.toLowerCase().equals("cat")){
            Cat cat = new Cat();
            return cat;
        } else if(petType.toLowerCase().equals("monkey")){
            Monkey monk = new Monkey();
            return monk;
        } else{
            return null;
        }

    }

    public void returnAllPets(){
        for (Map.Entry<String,Pets> pet: allThePets.entrySet()) {
            System.out.println(pet);
        }
    }

}
