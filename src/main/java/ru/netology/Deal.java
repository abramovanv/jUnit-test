package ru.netology;

public class Deal {
    private String comment;
    private int creditChange, debitChange;

    public Deal(String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }

    public String getComment() {
        return this.comment;
    }

    public int getCreditChange() {
        return this.creditChange;
    }

    public int getdebitChange() {
        return this.debitChange;
    }
}
