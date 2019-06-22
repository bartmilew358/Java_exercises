package programowanie2.quiz;

import programowanie2.quiz.model.Question;
import programowanie2.quiz.model.QuestionCategory;
import programowanie2.quiz.service.FileQuestionLoader;
import programowanie2.quiz.service.GameInOut;
import programowanie2.quiz.service.QuestionLoader;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        QuestionLoader questionLoader = new FileQuestionLoader();
        Question[] questions = questionLoader.load();
        GameInOut gameInOut = new GameInOut();

        while (true) {
            Game game = new Game();
            game.start(questions, gameInOut);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Czy chcesz kontynuować grę?" + "Wybierz [y] by kontynuować");
            String decision = scanner.nextLine();
            if (!decision.toLowerCase().equals("y")) {
                break;
            }
        }
    }
}
