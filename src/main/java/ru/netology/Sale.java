package ru.netology;

public class Sale extends Deal {

    private String nameProd;
    private int priceProd;


    public Sale(String nameProd, int priceProd) {
        super("Продажа " + nameProd + " на " + priceProd + " руб.", 0, priceProd);
        this.nameProd = nameProd;
        this.priceProd = priceProd;
    }
}
