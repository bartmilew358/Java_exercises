package pl.sda.enums;

public enum Currency {

    POLSKI_ZAŁOTY("PLN"),
    DOLAR("USD"),
    EURO("E"),
    YEN("Y"),
    FUNT_BRYTYJSKI("F");

    private String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    private double coursePLN_EUR = 4.3;

    public double getCoursePLN_EUR() {
        return coursePLN_EUR;
    }

    public double changePLN_EUR (double a) {

        return (a / this.getCoursePLN_EUR());



    }

}

