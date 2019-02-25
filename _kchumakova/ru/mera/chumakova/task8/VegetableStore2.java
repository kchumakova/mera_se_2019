package ru.mera.chumakova.task8;

import java.util.ArrayList;
import java.util.Random;

public class VegetableStore2 {
    public void loadCargo(ArrayList<Vegetables> vegetables) {
        if(vegetables.size()<=10) {
            Random rand = new Random();
            int tomatoBoxes = rand.nextInt((10-vegetables.size()));
            for (int i = 0; i < tomatoBoxes; i++) {
                vegetables.add(new Tomato());
            }
            System.out.println(String.format("Vegetable store 2. Loaded %s boxes of tomato", tomatoBoxes));
        } else {
            System.out.println("Vegetable store 2. Lorry is full");
        }

        if(vegetables.size()<=10) {
            Random rand = new Random();
            int potatoBoxes = rand.nextInt((10-vegetables.size()));
            for (int i = 0; i < potatoBoxes; i++) {
                vegetables.add(new Potato());
            }
            System.out.println(String.format("Vegetable store 2. Loaded %s boxes of potato", potatoBoxes));
        } else {
            System.out.println("Vegetable store 2. Lorry is full");
        }
    }
}
