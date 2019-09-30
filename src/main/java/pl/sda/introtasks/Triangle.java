package main.java.pl.sda.introtasks;

public class Triangle {

    public static void main(String[] args) {


        System.out.println(isTriangle(5,5,5));




    }

    public static boolean isTriangle(int a, int b, int c){

        if((a+b > c) && (a+c > b) && (b+c > a)){
            return true;
        }
        return false;
    }
}
