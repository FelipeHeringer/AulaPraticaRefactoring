public class HtmlStatement extends Statement {
    @Override
    protected String headerLine(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
                "</EM></H1><P>\n";
    }

    @Override
    protected String showFigures(Rental aRental) {
        return aRental.getMovie().getTitle() + ": " +
                String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    @Override
    protected String footerLines(Customer aCustomer) {
        String result = "";

        result += "<P>You owe <EM>" +
                String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";

        return result;
    }
}
