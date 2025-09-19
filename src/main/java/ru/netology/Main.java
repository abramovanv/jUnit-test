package ru.netology;

import taxes.TaxSystem15;
import taxes.TaxSystem6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Company com = new Company("Компания", new TaxSystem6());
        com.shiftMoney(1000);
        com.shiftMoney(-500);
        com.payTaxes();
        com.setTaxSystem(new TaxSystem15());
        com.shiftMoney(1000);
        com.shiftMoney(-500);
        com.payTaxes();
        com.shiftMoney(1000);
        com.shiftMoney(-1500);
        com.payTaxes();
        Deal deals[] = new Deal[]{new Sale("Картофель", 100),
                new Sale("Яблоки", 1500), new Expenditure("Мёд", 20)};
        System.out.println(com.applyDeals(deals));


    }
}