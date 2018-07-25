package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        printFactors(20);
        System.out.println("********************************");
        printFactors(36);
        System.out.println("********************************");
        printFactors(26);
        System.out.println("********************************");
        printFactors(10);
        System.out.println("********************************");
        printFactors(16);
        System.out.println("********************************");
    }

    private static String printFactors(int number) {
        if (number < 1) {
            return "Invalid Value";
        }
        String factorsConcatenated = " ";
        for (int factor = 1; factor < number; factor++) {
            if (number % factor != 0) {
                //factorsConcatenated = factorsConcatenated + factor;
                System.out.println("Was this even executed?");
            }
        }
        return factorsConcatenated;
    }
}


/*
----10
1 2 5 10
----25
1 5 25
----16
1 2 4 8 16
----26
1 2 13 26


 */