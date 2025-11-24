public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

   protected int getFrequentRenterPoints(int _daysRented) {
        // add frequent renter points
        int frequentRenterPoints = 0;
        frequentRenterPoints++;

        // add bonus for a two day new release rental
        if ((this.getPriceCode() == Movie.NEW_RELEASE) &&
                _daysRented > 1)
            return frequentRenterPoints++;

        return frequentRenterPoints;
   }
}