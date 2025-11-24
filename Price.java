public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    protected int getFrequentRenterPoints(int _daysRented) {
        return 1;
    }
}