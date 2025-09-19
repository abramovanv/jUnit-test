package ru.netology;

import taxes.TaxSystem;

public class Company {
    private String title;
    private int debit, credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            this.debit = this.debit + amount;
        }
        if (amount < 0) {
            this.credit = this.credit + Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int taxFee = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + this.title + " уплатила налог в размере: " + taxFee + " руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {

        for (int i = 0; i < deals.length; i++) {
            credit = credit + deals[i].getCreditChange();
            debit = debit + deals[i].getdebitChange();
        }
        int diff = debit - credit;
        payTaxes();
        return diff;
    }

}
