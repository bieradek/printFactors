package com.timbuchalka;

import java.lang.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(printFactors(10));
    }

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
}



