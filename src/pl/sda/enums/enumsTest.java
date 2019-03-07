package pl.sda.enums;

public class enumsTest {

    public static void main(String[] args) {

        double a = 5;
        double b = 7;

        Operation o1 = Operation.PLUS;
        o1.calculate(a,b);

        Operation o2 = Operation.MINUS;
        o2.calculate(a,b);

        Operation o3 = Operation.MULTIPLE;
        o3.calculate(a,b);

        Operation o4 = Operation.DIVIDE;
        o4.calculate(a,b);

        double pln = 202.8;

        Currency c1 = Currency.POLSKI_ZAŁOTY;
        System.out.println(pln + " zł to " + c1.changePLN_EUR(pln)/100 + " EUR");


    }

}
