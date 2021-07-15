package com.company;

/**
 * Description: This class is designed for covering the most part of the exercises from the ThinkingInJava4e book.
 *              Each exercise represents a public static method and each description of exercise is written above
 *              the method.
 *
 * @author Argishti_tigranyan
 */

public class OperatorsChapter {

    /*
     * Exercise:    7
     * Description: Write a program that simulates coin-flipping.
     */

    public static void coinFlipping() {
        if (Math.random() > 0.5) {
            System.out.println("Tails");
        } else {
            System.out.println("Heads");
        }
    }

    /*
     * Exercise:     10
     * Description:  Write a program with two constant values, one with alternating binary
     *               ones and zeroes, with a zero in the least-significant digit, and the second, also alternating,
     *               with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for
     *               this). Take these two values and combine them in all possible ways using the bitwise
     *               operators, and display the results using Integer.toBinaryString( ).
     */

    public static void bitwiseOperators(){
        int firstNumber = 0b11111110;
        int secondNumber = 0b00000011;

        System.out.println(Integer.toBinaryString(firstNumber & secondNumber));
        System.out.println(Integer.toBinaryString(firstNumber | secondNumber));
        System.out.println(Integer.toBinaryString(firstNumber ^ secondNumber));
        System.out.println(Integer.toBinaryString(firstNumber << secondNumber));
        System.out.println(Integer.toBinaryString(firstNumber >> secondNumber));
    }

    /*
     * Exercise:     11
     * Description:  Start with a number that has a binary one in the most significant
     *               position (hint: Use a hexadecimal constant). Using the signed right-shift operator, right shift
     *               it all the way through all of its binary positions, each time displaying the result using
     *               Integer.toBinaryString( ).
     */

    public static void rightShift(){

        int binaryNumber = 0b10000000;

        for (int i = 0; i < 8; i++) {
            binaryNumber >>>= 1;
            System.out.println(Integer.toBinaryString(binaryNumber));
        }

    }

}
