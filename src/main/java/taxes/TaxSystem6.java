package taxes;

public class TaxSystem6 extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        return (debit * 6) / 100;
    }
}
