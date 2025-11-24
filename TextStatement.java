public class TextStatement extends Statement {
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
