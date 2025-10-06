package org.example;

public class NestedIf {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get student discount of 10%");
                price *= 0.9 * 0.8;
            }else{
                System.out.println("You get student discount of 10%");
                price *=0.9;
            }
        }else{
           if (isSenior){
               System.out.println("You get a senior discount of 20%");
               price *= 0.8;
           }
        }

        System.out.printf("The price of the ticket is: $%f", price);
    }
}
