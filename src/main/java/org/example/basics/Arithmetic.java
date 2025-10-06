package org.example;

public class Arithmetic {

    public static void main(String[] args) {
        //Arithmetic operators
        int x = 10;
        int y = 2;
        int z;

        z = x+y;
        z = x-y;
        z = x*y;
        z = x/y;
        z = x%y;

        System.out.println(z);

        //Augumented Assignment Operators
        x+=y;
        System.out.println(x);

        //increment and Decrement Operators
        x--;
        ++x;

        System.out.println(x);

        //Order of operation [PEMDAS]
        double result = 3+4*(7-5)/2.0;
        System.out.println(result);
    }
}
