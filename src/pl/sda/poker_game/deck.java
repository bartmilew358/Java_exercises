package pl.sda.poker_game;
//
public enum deck {

    card1("2", "c", 2),
    card2("2", "d", 2),
    card3("2", "h", 2),
    card4("2", "s", 2),
    card5("3", "c", 3),
    card6("3", "d", 3),
    card7("3", "h", 3),
    card8("3", "s", 3),
    card9("4", "c", 4),
    card10("4", "d", 4),
    card11("4", "h", 4),
    card12("4", "s", 4),
    card13("5", "c", 5),
    card14("5", "d", 5),
    card15("5", "h", 5),
    card16("5", "s", 5),
    card17("6", "c", 6),
    card18("6", "d", 6),
    card19("6", "h", 6),
    card20("6", "s", 6),
    card21("7", "c", 7),
    card22("7", "d", 7),
    card23("7", "h", 7),
    card24("7", "s", 7),
    card25("8", "c", 8),
    card26("8", "d", 8),
    card27("8", "h", 8),
    card28("8", "s", 8),
    card29("9", "c", 9),
    card30("9", "d", 9),
    card31("9", "h", 9),
    card32("9", "s", 9),
    card33("T", "c", 10),
    card34("T", "d", 10),
    card35("T", "h", 10),
    card36("T", "s", 10),
    card37("J", "c", 11),
    card38("J", "d", 11),
    card39("J", "h", 11),
    card40("J", "s", 11),
    card41("Q", "c", 12),
    card42("Q", "d", 12),
    card43("Q", "h", 12),
    card44("Q", "s", 12),
    card45("K", "c", 13),
    card46("K", "d", 13),
    card47("K", "h", 13),
    card48("K", "s", 13),
    card49("A", "c", 14),
    card50("A", "d", 14),
    card51("A", "h", 14),
    card52("A", "s", 14);

    private String rank; // card
    private String siuts; // colour
    private int card_value; // value of card e.x. 2 = 2, 9 = 9, T = 10, J = 11, A = 14;

    deck(String rank, String siuts, int card_value) {
        this.rank = rank;
        this.siuts = siuts;
        this.card_value = card_value;
    }

    public String getRank() {
        return rank;
    }

    public String getSiuts() {
        return siuts;
    }

    public int getCard_value() {
        return card_value;
    }

    @Override
    public String toString() {
        return "deck{" +
                "rank='" + rank + '\'' +
                ", siuts='" + siuts + '\'' +
                ", card_value=" + card_value +
                '}';
    }
}
