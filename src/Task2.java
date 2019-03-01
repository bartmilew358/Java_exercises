//Napisz program, który tworzy jedną zmienną, a następnie wypisze na ekran jej wartość podniesioną do 3 potęgi.

public class Task2 {
    public static void main(String[] args) {

        double a = 8;
//        double potega = Math.PI;
//        double b = Math.pow(a,potega);
        double b = Math.pow(a,3);
        double c = Math.pow(a,Math.PI);
//        double d = Math.sqrt(a);


        System.out.println("a = " + a);
        System.out.println("a^3 = " + b);
        System.out.println("a^PI = " + c);
        System.out.println("Pierwiastek z a w przybliżeniu do 0 miejsc po przecinku. = " + Math.round(Math.sqrt(a)));

    }
}

