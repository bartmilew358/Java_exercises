package pl.sda.objectstask.Temperature;

import java.util.Scanner;

public class converterToCelsiusApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj temperature w F:");
        String y = scan.nextLine();

        double d=Double.parseDouble(y);

        if (d < -459.67) {
            System.out.println("Temperatura poniżej zera absolutnego.");

        }

        else {

            convertToCelsius temperatura = new convertToCelsius();

            System.out.println("Temperatura w stopniach C:" + temperatura.konwerter(d));

        }
    }
}
