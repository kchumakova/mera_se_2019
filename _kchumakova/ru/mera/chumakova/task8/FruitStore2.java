package ru.mera.chumakova.task8;

import java.util.ArrayList;
import java.util.Random;

public class FruitStore2 {
    public void loadCargo(ArrayList<Fruits> fruits) {
        if(fruits.size()<10) {
            Random rand = new Random();
            int orangeBoxes = rand.nextInt((10-fruits.size()));
            for (int i = 0; i < orangeBoxes; i++) {
                fruits.add(new Orange());
            }
            System.out.println(String.format("Fruit store 2. Loaded %s boxes of apples", orangeBoxes));
        } else {
            System.out.println("Fruit store 2. Lorry is full");
        }
        if(fruits.size()<10) {
            Random rand = new Random();
            int bananaBoxes = rand.nextInt((10-fruits.size()));
            for (int i = 0; i < bananaBoxes; i++) {
                fruits.add(new Banana());
            }
            System.out.println(String.format("Fruit store 2. Loaded %s boxes of bananas", bananaBoxes));
        } else {
            System.out.println("Fruit store 2. Lorry is full");
        }
    }

}
