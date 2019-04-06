package pl.sda.enums;

public enum Currency {

    POLSKI_ZAŁOTY("PLN", 1),
    DOLAR("USD", 0.23),
    EURO("E", 0.5),
    YEN("Y", 0.67),
    FUNT_BRYTYJSKI("F", 0.53);

    private String symbol;
    private double kurs;

//    Currency(String symbol) {
//        this.symbol = symbol;
//    }


    Currency(String symbol, double kurs) {
        this.symbol = symbol;
        this.kurs = kurs;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getKurs() {
        return kurs;
    }


    @Override
    public String toString() {
        return "Currency{" +
                "symbol='" + symbol + '\'' +
                ", kurs=" + kurs +
                '}';
    }

    private double coursePLN_EUR = 4.3;

    public double getCoursePLN_EUR() {
        return coursePLN_EUR;
    }

    public double changePLN_EUR (double a) {

        return ((Math.round((a / this.getCoursePLN_EUR())*100)));//

    }

}

