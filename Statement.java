import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = headerLine(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += showFigures(each);
        }
        result += footerLines(aCustomer);
        return result;
    }

    protected abstract String headerLine(Customer aCustomer);

    protected abstract String showFigures(Rental aRental);

    protected abstract String footerLines(Customer aCustomer);
}
