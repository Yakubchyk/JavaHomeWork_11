package com.yk3_AnimalsList;

import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList<String> animals;

    public AnimalCollection() {
        this.animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public String removeAnimal() {
        return animals.removeLast();
    }

    public LinkedList<String> getAnimals() {
        return animals;
    }

}
