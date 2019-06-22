package programowanie2.quiz.service;

import java.util.Scanner;

public class GameInOut {

    Scanner scanner = new Scanner(System.in);

    public void printLine(String text) {
        System.out.println(text);
    }

    public int getIn() {
        return scanner.nextInt();

    }
}
