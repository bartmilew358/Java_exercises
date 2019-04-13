package pl.sda.stack.alfa;

import com.sun.org.apache.bcel.internal.generic.StackInstruction;

public class SystemNumbers {

    public static void main(String[] args) {

        Stack stack = new Stack();

        int liczba = 10;
        int podstawa = 2;



        if (liczba > 0) {

            liczba = liczba % podstawa;
            stack.push(liczba % podstawa);

        }

        System.out.println(stack);


    }




}
