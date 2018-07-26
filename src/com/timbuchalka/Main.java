package com.timbuchalka;

import java.lang.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println(printFactors(10));
//        System.out.println(printFactors(25));
//        System.out.println(printFactors(16));
        printFactors(10);
        printFactors(25);
        printFactors(16);
    }

    private static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int factor = 1;
        while (factor <= number) {
            if (number % factor == 0) {
                System.out.println(factor);
            }
            factor = factor + 1;
        }
    }

//    public static String printFactors(int number) {
//        if (number < 1) {
//            return "Invalid Value";
//        }
//        String factorsConcatenated = "1";
//        for (int factor = 2; factor <= number; factor++) {
//            if (number % factor == 0) {
//                factorsConcatenated = factorsConcatenated + " " + factor;
//            }
//        }
//        return factorsConcatenated;
//    }
/*
String concatenation '+' in loop less... (Ctrl+F1)
Reports String concatenation in loops. As every String concatenation copies the whole String,
usually it is preferable to replace it with explicit calls to StringBuilder.append() or StringBuffer.append().
 */
/*
*****************************************SOLUTION USING STRINGBUILDER*******************************

    public static StringBuilder printFactors(int number) {
        if (number < 1) {
            StringBuilder invalidValue = new StringBuilder("Invalid Value");
            return invalidValue;
        }
        StringBuilder factorsConcatenated = new StringBuilder("1");
        for (int factor = 2; factor <= number; factor++) {
            if (number % factor == 0) {
                factorsConcatenated = factorsConcatenated.append(" " + factor);
            }
        }
        return factorsConcatenated;
    }

 */

/*
*******************OTHER PEOPLE CODES*****************
     public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        else{
            int i=1;
            while(i<=number){
                if(number%i==0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
 */


/*
    public static String printFactors(int number) {
        if (number < 1) {
            return "Invalid Value";
        }
        String factorsConcatenated = "1";
        for (int factor = 2; factor <= number; factor++) {
            if (number % factor == 0) {
                factorsConcatenated = factorsConcatenated + "" + factor;
            }
        }
        return factorsConcatenated;
    }
 */

}



