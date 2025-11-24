public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    public double getCharge(int _daysRented) {
        double thisAmount = 0;
        // determine amounts for each line
        switch (this.getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (_daysRented > 2)
                    thisAmount += (_daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += _daysRented * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (_daysRented > 3)
                    thisAmount += (_daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

    public int getFrequentRenterPoints(int _daysRented) {
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