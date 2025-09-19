package taxes;

public class TaxSystem15 extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = ((debit - credit) * 15) / 100;
        if (tax <= 0) {
            return 0;
        } else {
            return tax;
        }
    }
}
