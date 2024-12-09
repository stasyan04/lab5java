package com.stanislav.labwork5;

import java.util.Comparator;

public class GiftDemo {
    public static void main(String[] args) {
        try {
            Candy[] candies = {
                    new ChocolateCandy("ChocoDelight", 20, 30, 50),
                    new CaramelCandy("Caramella", 15, 40, 0),
                    new Lollipop("FruityPop", 10, 35, 0),
                    new ChocolateCandy("DarkChoco", 25, 20, 80),
                    new CaramelCandy("Toffee", 17, 45, 0)
            };

            Gift gift = new Gift(candies);

            System.out.println("Початковий набір цукерок:");
            gift.printCandies();

            double totalWeight = gift.getTotalWeight();
            System.out.println("\nЗагальна вага подарунка: " + totalWeight + " г");

            gift.sortCandies(Comparator.comparingDouble(Candy::getSugarContent));
            System.out.println("\nЦукерки після сортування за вмістом цукру:");
            gift.printCandies();

            double minChocolate = 30;
            double maxChocolate = 60;
            Candy foundCandy = gift.findCandyByChocolateRange(minChocolate, maxChocolate);
            System.out.println("\nЗнайдена цукерка з шоколадом у діапазоні [" + minChocolate + ", " + maxChocolate + "]:");
            System.out.println(foundCandy);

        } catch (CandyNotFoundException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Несподівана помилка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}