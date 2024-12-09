package com.stanislav.labwork5;

import java.util.Arrays;
import java.util.Comparator;

public class Gift {
    private Candy[] candies;

    public Gift(Candy[] candies) {
        if (candies == null || candies.length == 0) {
            throw new IllegalArgumentException("Масив цукерок не може бути порожнім!");
        }
        this.candies = candies;
    }

    public double getTotalWeight() {
        double total = 0;
        for (Candy c : candies) {
            total += c.getWeight();
        }
        return total;
    }

    public void sortCandies(Comparator<Candy> comparator) {
        Arrays.sort(candies, comparator);
    }

    public Candy findCandyByChocolateRange(double minChocolate, double maxChocolate) throws CandyNotFoundException {
        for (Candy c : candies) {
            double chocolate = c.getChocolateContent();
            if (chocolate >= minChocolate && chocolate <= maxChocolate) {
                return c;
            }
        }
        throw new CandyNotFoundException("Цукерку з заданим діапазоном шоколаду не знайдено!");
    }

    public void printCandies() {
        for (Candy c : candies) {
            System.out.println(c.toString());
        }
    }
}