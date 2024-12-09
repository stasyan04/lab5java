package com.stanislav.labwork5;

public class ChocolateCandy extends Candy {

    public ChocolateCandy(String name, double weight, double sugarContent, double chocolateContent) {
        super(name, weight, sugarContent, chocolateContent);
    }

    @Override
    public String getDescription() {
        return "Шоколадна цукерка " + getName() + " з вмістом шоколаду: " + getChocolateContent();
    }
}