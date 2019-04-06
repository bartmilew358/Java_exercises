package pl.sda.loops;

/*
* Napisz metodę która wyświetli na ekranie prostokąt o podanych rozmiarach: width i height (to są parametry metody).
* Podpowiedź: zobacz metodę: pl.sda.loops.ForLoop.leftTriangle()
* */

public class Task7 {

    public static void main(String[] args) {

        leftTriangle(2, 5);
    }

    private static void leftTriangle(int width, int height) {

        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= width; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
