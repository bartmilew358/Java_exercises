package programowanie2.quiz;

import programowanie2.quiz.model.Question;
import programowanie2.quiz.model.QuestionCategory;
import programowanie2.quiz.service.GameInOut;

public class Game {
    GameInOut gameInOut;

    public Game(GameInOut gameInOut) {
        this.gameInOut = gameInOut;
    }

    public void start(Question[] questions, GameInOut gameInOut){

        this.gameInOut = gameInOut;

        gameInOut.printLine("Witamy w grze Quiz");
        gameInOut.printLine("Kategorie: ");
        showCategoryList();
        gameInOut.printLine("Wprowadź numer kategorii: ");
    }

    private void showCategoryList() {
        QuestionCategory[] questionCategories = QuestionCategory.values();

        for (int i = 0; i < QuestionCategory.values().length; i++) {
            System.out.println(i+1 + ". " + QuestionCategory.values()[i]);
        }
    }
}
