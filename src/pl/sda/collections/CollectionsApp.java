package pl.sda.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsApp {

    public static void main(String[] args) {

        List<Triangle> listT = new ArrayList<>();
        listT.add(new Triangle(3,3));
        listT.add(new Triangle(2,5));
        listT.add(new Triangle(1,8));
        listT.add(new Triangle(3,3));
        listT.add(new Triangle(4,3));
        listT.add(new Triangle(10,3));

        System.out.println(listT.size());

        for (Triangle t : listT) {
            System.out.println("Wymiary: " + t);
            System.out.println("Pole: " + t.getArea());
            System.out.println("Obwód: " + t.getPerimeter());
        }


        List<Rectangle> listR = new ArrayList<>();
        listR.add(new Rectangle(2,2));
        listR.add(new Rectangle(3,4));
        listR.add(new Rectangle(1,8));
        listR.add(new Rectangle(3,3));
        listR.add(new Rectangle(4,1));
        listR.add(new Rectangle(1,1));

        for (Rectangle r : listR) {
            System.out.println("Wymiary: " + r);
            System.out.println("Pole: " + r.getArea());
            System.out.println("Obwód: " + r.getPerimeter());
        }

        List<Circle> listC = new ArrayList<>();
        listC.add(new Circle(2));
        listC.add(new Circle(4));
        listC.add(new Circle(8));
        listC.add(new Circle(3));
        listC.add(new Circle(1));
        listC.add(new Circle(12));

        for (Circle c : listC) {
            System.out.println("Wymiary: " + c);
            System.out.println("Pole: " + c.getArea());
            System.out.println("Obwód: " + c.getPerimeter());
        }

        // Task 1
        // Bazując na kodzie utworzonym na potrzeby omawiania interfejsów, utwórz kolekcję figur każdego typu.
        // Na podstawie utworzonej kolekcji, oblicz pola i obwody wszystkich figur znajdujących się w kolekcji.

        List<Figure> listF = new ArrayList<>();
        listF.add(new Rectangle(2,2));
        listF.add(new Rectangle(3,4));
        listF.add(new Rectangle(1,8));
        listF.add(new Triangle(3,3));
        listF.add(new Triangle(4,3));
        listF.add(new Triangle(10,3));
        listF.add(new Circle(3));
        listF.add(new Circle(1));
        listF.add(new Circle(12));

        double sumArea = 0;
        double perimeter = 0;

        for (Figure f : listF) {
            System.out.println("Wymiary: " + f);
            System.out.println("Pole: " + f.getArea());
            System.out.println("Obwód: " + f.getPerimeter());
            sumArea += f.getArea();
            perimeter += f.getPerimeter();
        }

        System.out.println("Suma pól:  " + sumArea);
        System.out.println("Suma obwodów:  " + perimeter);
    }
}
