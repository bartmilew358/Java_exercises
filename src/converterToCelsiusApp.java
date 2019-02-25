import java.util.Scanner;

public class converterToCelsiusApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj temperature w F:");
        String y = scan.nextLine();

        double z;
        double d=Double.parseDouble(y);


        convertToCelsius temperatura = new convertToCelsius();

        z = temperatura.konwerter(15);
            System.out.println("Temperatura w stopniach C:" + temperatura.konwerter(212));
    }
}
