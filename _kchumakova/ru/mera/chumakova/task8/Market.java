package ru.mera.chumakova.task8;

import java.util.ArrayList;

public class Market {
    public void printCargo(ArrayList<Vegetables> vegetables, ArrayList<Fruits> fruits) {
        ArrayList<Plants> plants = new ArrayList<>();
        plants.addAll(vegetables);
        plants.addAll(fruits);
        System.out.println("Market receives the following plants: ");
        for (Plants plant : plants) {
            System.out.println(plant.getName());
        }
    }

}
