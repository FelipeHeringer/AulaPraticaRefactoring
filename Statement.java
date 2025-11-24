public abstract class Statement {
    public abstract String value(Customer aCustomer);

    protected abstract String headerLine(Customer aCustomer);

    protected abstract String showFigures(Rental aRental);

    protected abstract String footerLines(Customer aCustomer);
}
