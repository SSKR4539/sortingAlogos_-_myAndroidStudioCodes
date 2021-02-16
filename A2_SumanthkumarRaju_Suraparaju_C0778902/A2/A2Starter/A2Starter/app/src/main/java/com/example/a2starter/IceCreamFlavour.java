package com.example.a2starter;

import java.io.Serializable;

public class IceCreamFlavour  {

    String flavour = "";
    String description = "";
    int quantityRemaining = 0;
    double price = 0;

    public IceCreamFlavour (String flavour, String description, int quantityRemaining, double price){
        this.flavour = flavour;
        this.description = description;
        this.quantityRemaining = quantityRemaining;
        this.price = price;
    }

    public double getTotalCost(int quantity){

        double totalCost;

        totalCost = this.price * quantity;

        return totalCost;
    }

}
