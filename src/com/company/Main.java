package com.company;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        LinkedList<Gadget> gadgets = new LinkedList<>();
        Random rnd = new Random();

        String[] brands = new String[10];
        for (int i = 1; i < 10; i++) {
            brands[i] = "Brand" + i;
        }

        for (int i = 0; i < 50; i++) {
            gadgets.add(new Pc("Gaming PC", 84560 + rnd.nextInt((777 - 1) + 1) + 1, brands[rnd.nextInt((9 - 1) + 1) + 1], 15 + rnd.nextInt((26 - 21) + 21) + 1));
            gadgets.add(new LapTop("Office LapTop", 22760 + rnd.nextInt((777 - 1) + 1) + 1, brands[rnd.nextInt((9 - 1) + 1) + 1]));
        }

        System.out.println(gadgets);
        System.out.println("Length of all the gadgets: " + gadgets.size());

        double totalAmountOfMoneyInAssets = 0;
        for (int i = 0; i < gadgets.size(); i++) {
            if (gadgets.get(i) instanceof Pc) {
                totalAmountOfMoneyInAssets += ((Pc) gadgets.get(i)).getPrice();
            } else totalAmountOfMoneyInAssets += ((LapTop) gadgets.get(i)).getPrice();
        }

        System.out.println(totalAmountOfMoneyInAssets + " som before discount");

        for (int i = 0; i < gadgets.size(); i++) {
            if (gadgets.get(i) instanceof LapTop) {
                ((LapTop) gadgets.get(i)).setPrice(((LapTop) gadgets.get(i)).getPrice() / 20);
            }
        }

        float totalAmountOfMoneyInAssetsAfterDiscount = 0f;
        for (int j = 0; j < gadgets.size(); j++) {
            if (gadgets.get(j) instanceof Pc) {
                totalAmountOfMoneyInAssetsAfterDiscount += ((Pc) gadgets.get(j)).getPrice();
            } else totalAmountOfMoneyInAssetsAfterDiscount += ((LapTop) gadgets.get(j)).getPrice();
        }

        System.out.println(totalAmountOfMoneyInAssetsAfterDiscount + " som after discount");

        for (int i = 0; i < gadgets.size(); i++) {
            if (gadgets.get(i) instanceof LapTop) {
                if (((LapTop) gadgets.get(i)).getPrice() >= 1153 && ((LapTop) gadgets.get(i)).getPrice() <= 1160  ) {
                    System.out.println(gadgets.get(i).toString());
                }

            }
        }
    }
}

