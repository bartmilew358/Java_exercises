package pl.sda.stat;

import javax.sound.midi.Soundbank;

public class Math {

    private Math() {};

    public static void main(String[] args) {

        System.out.println(add(2,6));
        System.out.println(substract(2,6));
        System.out.println(multiply(2,6));
        System.out.println(devide(2,6));
        System.out.println(min(2,6));
        System.out.println(max(2,6));
        System.out.println(pow(2,6));
        System.out.println(cirleField(8));



    }

    public static int add (int a, int b){
        int add;
        add = a + b;
        return add;
    }

    public static int substract (int a, int b){
        int sub;
        sub = a - b;
        return sub;
    }

    public static int multiply (int a, int b){
        int multi;
        multi = a * b;
        return multi;
    }

    public static int devide (int a, int b){
        int dev;
        dev = a / b;
        return dev;
    }

    public static int min (int a, int b){
        if (a<b) {
            return a;
        } else return b;
    }

    public static int max (int a, int b){
        return (a > b) ? a : b;
//        if (a>b) {
//            return a;
//        } else return b;
    }

    public static int pow (int a, int b){

        int pow = a;
        for (int i = 0; i < b - 1; i++) {
            pow *= a;
        }
        return pow;
    }


    public static double PI = 3.14;

    public static double cirleField (int r) {

        double field = 0;
        field = PI * pow(r,2);
        return field;
    }
}
