package pl.sda.enums;

public enum DzieńTygodnia {


    PONIEDZIAŁEK(1, "pon"),
    WTOREK(2, "wt"),
    ŚRODA(3, "śr"),
    CZWARTEK(4, "czw"),
    PIĄTEK(5, "pt"),
    SOBOTA(6, "sb"),
    NIEDZIELA(7, "nd");

    private int numer;
    private  String skrót;

    DzieńTygodnia(int numer, String skrót) {
        this.numer = numer;
        this.skrót = skrót;
    }


    @Override
    public String toString() {
        return "DzieńTygodnia{" +
                "Dzień tygodnia = " + super.toString() +
                " numer = " + numer +
                ", skrót = '" + skrót + '\'' +
                '}';
    }

    public static void main(String[] args) {


        DzieńTygodnia dzień = DzieńTygodnia.NIEDZIELA;

        for (DzieńTygodnia d: DzieńTygodnia.values())
            System.out.println(d);
//            System.out.println(d.numer + " " + d.skrót);


    }


}


