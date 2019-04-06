package pl.sda.objectstask.Triangle;

public class TriangleApp {


    public static void main(String[] args) {

        Triangle trojkat = new Triangle();


        if (trojkat.isRectangular(5,4,3) == true)
            System.out.println("Prostokątny");
        else System.out.println("Nawet nie wiem czy to trójkąt.");

        //trojkat.isRectangular(5,4,3);

        //System.out.println(trojkat.isRectangular(5,4,9));

    }
}
