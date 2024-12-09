package com.stanislav.labwork5;

public class CaramelCandy extends Candy {

    public CaramelCandy(String name, double weight, double sugarContent, double chocolateContent) {
        super(name, weight, sugarContent, chocolateContent);
    }

    @Override
    public String getDescription() {
        return "Карамельна цукерка " + getName() + ", солодка та тягуча.";
    }
}