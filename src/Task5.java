//Wyświetl na ekranie pięć pierwszych liter alfabetu: łacińskiego (zaczyna się od kodu: 65), hebrajskiego (zaczyna się od: 1488) i tybetańskiego (zaczyna się od: 3840)

public class Task5 {
    public static void main(String[] args) {

        char a = 65;
        int b = a +5;

//        System.out.println(a++);
//        System.out.println(a++);
//        System.out.println(a++);
//        System.out.println(a++);
//        System.out.println(a++);

        while (a<=b) {

            System.out.println(a);
            a++;
        }


        a = 1488;
        b = a +5;

        while (a<=b) {

            System.out.println(a);
            a++;
        }

//        System.out.println(a++);
//        System.out.println(a++);
//        System.out.println(a++);
//        System.out.println(a++);
//        System.out.println(a++);

        a = 3840;
        b = a +5;

        while (a<=b) {

            System.out.println(a);
            a++;
        }

//        System.out.println(a++);
//        System.out.println(a++);
//        System.out.println(a++);
//        System.out.println(a++);
//        System.out.println(a++);


    }
}

