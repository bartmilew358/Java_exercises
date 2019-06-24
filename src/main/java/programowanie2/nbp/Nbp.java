package programowanie2.nbp;

import java.time.LocalDate;

public class Nbp {

    String[] table;
    String currency;
    String code;
    String rates;

    public Nbp(String[] table, String currency, String code, String rates) {
        this.table = table;
        this.currency = currency;
        this.code = code;
        this.rates = rates;
    }

    public String[] getTable() {
        return table;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public String getRates() {
        return rates;
    }
}
