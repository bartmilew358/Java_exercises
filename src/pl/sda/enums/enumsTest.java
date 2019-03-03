package pl.sda.enums;

public class enumsTest {

    public static void main(String[] args) {

        Operation o1 = Operation.PLUS;
        o1.calculate(5,8);

        Operation o2 = Operation.MINUS;
        o2.calculate(5,8);



        Currency c1 = Currency.POLSKI_ZAŁOTY;
        System.out.println("Przeliacznie złotych na euro = " + c1.changePLN_EUR(100));
    }

}
