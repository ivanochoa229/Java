package org.example;

import org.example.factories.GalaClothesFactory;
import org.example.factories.SportClothesFactory;
import org.example.products.Shirt;
import org.example.products.Shoe;
import org.example.products.Trousers;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fabrica de Ropa deportiva: \n");
        ClothesFactory sportClothesFactory = new SportClothesFactory();
        Shirt sportShirt = sportClothesFactory.createShirt();
        sportShirt.hasButtons();
        sportShirt.hasLongSleeves();
        Shoe sportShoe = sportClothesFactory.createShoes();
        sportShoe.isElegantShoes();
        sportShoe.isRunningShoes();
        Trousers sportTrousers = sportClothesFactory.createTrousers();
        sportTrousers.hasPockets();
        sportTrousers.getClosureType();
        System.out.println("Fabrica de Ropa de gala: \n");
        ClothesFactory galaClothesFactory = new GalaClothesFactory();
        Shirt galaShirt = galaClothesFactory.createShirt();
        galaShirt.hasLongSleeves();
        galaShirt.hasButtons();
        Shoe galaShoe = galaClothesFactory.createShoes();
        galaShoe.isRunningShoes();
        galaShoe.isElegantShoes();
        Trousers galaTrousers = galaClothesFactory.createTrousers();
        galaTrousers.hasPockets();
        galaTrousers.getClosureType();
    }
}