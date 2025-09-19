package ru.netology;

public class Expenditure extends Deal {
    private String nameProd;
    private int priceProd;


    public Expenditure(String nameProd, int priceProd) {
        super("Покупка " + nameProd + " на " + priceProd + " руб.", priceProd, 0);
        this.nameProd = nameProd;
        this.priceProd = priceProd;
    }
}
