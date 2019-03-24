package pl.sda.poker_game;

import java.util.*;

public class pkrGame {

    public static void main(String[] args) {



//        System.out.println(deck.card1.getRank() + deck.card1.getSiuts());

//        String player1 = deck.getRandom().name();
//        System.out.println(player1);

        System.out.println("Dealerem jest zawodnik nr: " + giveTheButton());
    }

    private static int giveTheButton() {

        int var;
        int positionForButton;

        List<Integer> oneCardList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            var = deck.getRandom().getCard_value();

            if (var == 14) {
                positionForButton = i;
                return positionForButton;
            }
            else
            oneCardList.add(var);
        }

        int max = Collections.max(oneCardList); // wyznaczenie MAX w liście
        positionForButton = oneCardList.indexOf(max)+1; // pobranie indexu dla MAX i zwiększenie o 1 aby odzwierciedlić faktyczny numer gracza

        return positionForButton;
    }

}
