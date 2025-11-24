import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();

        String result = headerLine(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += showFigures(each);
        }

        result += footerLines(aCustomer);
        return result;
    }

    @Override
    protected String headerLine(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() +
                "\n";
    }

    @Override
    protected String footerLines(Customer aCustomer) {
        String result = "";

        // add footer lines
        result += "Amount owed is " +
                String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";

        return result;
    }

    @Override
    protected String showFigures(Rental aRental) {
        String result = "";
        result += "\t" + aRental.getMovie().getTitle() + "\t" +
                String.valueOf(aRental.getCharge()) + "\n";

        return result;
    }
}
