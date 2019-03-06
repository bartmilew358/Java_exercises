package pl.sda.loops;

/*
* Zmień metodę pl.sda.loops.ForLoop.sumNumbersFromUser() tak by przyjmowała liczby typu float.
* W podsumowaniu oprócz sumy wypisz także średnią arytmetyczną podanych liczb.
* */

import javax.swing.*;

public class Task6 {

    public static void main(String[] args) {

        sumNumbersFromUser(4);

    }

    private static void sumNumbersFromUser(int numbersSize) {

        float sum = 0;
        int var = 0;

        for (int i = 1; i <= numbersSize; i++) {
            String numberInString = JOptionPane.showInputDialog("Podaj liczbę:");
            float numberFromUser = Float.valueOf(numberInString);
            System.out.println("Liczba nr " + i + " to: " + numberFromUser);
            sum += numberFromUser;
            var++;
        }

        System.out.println("sum = " + (sum));
        System.out.println("arithmetic average = " + (sum/var));

    }



}
