package org.example;

public class PrintFExample {
    public static void main(String[] args) {
        //[flags][width][.precision][specifier-character]

        //specifier-character
        String name = "Furti";
        char firstLetter = 'F';
        double height = 60.5;
        int age = 31;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("Your height is %f\n", height);

        if(isEmployed){
            System.out.printf("Employed: %b\n", isEmployed);
        }

        System.out.printf("%s is %d years old", name, age);

        //precision
        double price1 = 9.99;
        double price2 = 100.15;
        double price3= -54.01;

        System.out.printf("%.1%f\n", price1); // 9.9
        System.out.printf("%.1%f\n", price2);
        System.out.printf("%.1%f", price3);

        //flags
        //+ output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        System.out.printf("%+.2%f\n", price1); //+9.99
        System.out.printf("%+.2%f\n", price2);
        System.out.printf("%+.2%f", price3);

        System.out.printf("%,.2%f\n", price1);
        System.out.printf("%,.2%f\n", price2);
        System.out.printf("%,.2%f", price3);

        //width
        // 0 zero padding
        //number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
