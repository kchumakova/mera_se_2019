package ru.mera.chumakova.task8;

import java.util.ArrayList;

public class LaunchLorries {
    public static void main(String[] args) {
        ArrayList<Vegetables> vegetables = new ArrayList<>();
        ArrayList<Fruits> fruits = new ArrayList<>();

        FruitStore1 fruitStore1 = new FruitStore1();
        fruitStore1.loadCargo(fruits);

        FruitStore2 fruitStore2 = new FruitStore2();
        fruitStore2.loadCargo(fruits);

        VegetableStore1 vegetableStore1 = new VegetableStore1();
        vegetableStore1.loadCargo(vegetables);

        VegetableStore2 vegetableStore2 = new VegetableStore2();
        vegetableStore2.loadCargo(vegetables);

        Market market = new Market();
        market.printCargo(vegetables, fruits);
    }
}
