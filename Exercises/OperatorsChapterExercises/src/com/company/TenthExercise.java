package com.company;

/**
 * Description:  Write a program with two constant values, one with alternating binary
 *               ones and zeroes, with a zero in the least-significant digit, and the second, also alternating,
 *               with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for
 *               this). Take these two values and combine them in all possible ways using the bitwise
 *               operators, and display the results using Integer.toBinaryString( ).
 *
 * @author Argishti_Tigranyan
 */

public class TenthExercise {
    public static void bitwiseOperators(){
        int firstNumber = 0b11111110;
        int secondNumber = 0b00000011;

        System.out.println(Integer.toBinaryString(firstNumber & secondNumber));
        System.out.println(Integer.toBinaryString(firstNumber | secondNumber));
        System.out.println(Integer.toBinaryString(firstNumber ^ secondNumber));
        System.out.println(Integer.toBinaryString(firstNumber << secondNumber));
        System.out.println(Integer.toBinaryString(firstNumber >> secondNumber));
    }

}
