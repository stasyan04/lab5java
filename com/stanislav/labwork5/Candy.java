package com.stanislav.labwork5;

public abstract class Candy {
    private String name;
    private double weight;
    private double sugarContent;
    private double chocolateContent;

    public Candy(String name, double weight, double sugarContent, double chocolateContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
        this.chocolateContent = chocolateContent;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public double getChocolateContent() {
        return chocolateContent;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return name + " [вага: " + weight + " г, цукор: " + sugarContent +
                ", шоколад: " + chocolateContent + "]";
    }
}