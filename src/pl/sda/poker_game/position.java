package pl.sda.poker_game;

public enum position {

    BTN(1),
    SB(2),
    BB(3),
    UTG(4),
    UTG1(5),
    UTG2(6),
    UTG3(7),
    MP1(8),
    MP2(9),
    MP3(10);

    int numberOfPosition;

    position(int numberOfPosition) {
        this.numberOfPosition = numberOfPosition;
    }

    public int getNumberOfPosition() {
        return numberOfPosition;
    }

    @Override
    public String toString() {
        return "position{" +
                "numberOfPosition=" + numberOfPosition +
                '}';
    }
}
