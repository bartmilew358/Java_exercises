package pl.sda.Arrays_old;

/*
*
* */

public class Task6 {

    public static void main(String[] args) {

        Car[] arrayOfCar = new Car[]{
                new Car("Ford1", "blue"),
                new Car("Ford2", "white"),
                new Car("Ford3", "silver"),
                new Car("Ford4", "black"),
        };

        System.out.println("Tablica car:");
        showArrayOfCar(arrayOfCar);
        System.out.println("**************************************");
        System.out.println("Odwrócona tablica car:");
        showArrayOfCar(reverseArrayOfCar(arrayOfCar));

    }

    private static void showArrayOfCar(Car... arr){
        for (Car c: arr) {
            System.out.println(c);
        }
    }

    public static Car[] reverseArrayOfCar(Car... arr){

        Car var;

        for (int i = 0; i < arr.length / 2; i++) {
            var = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = var;
        }
        return arr;
    }
}
