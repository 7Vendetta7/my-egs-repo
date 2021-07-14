package com.company;

/**
 * Description: Write a program that simulates coin-flipping.
 * @author Argishti_Tigranyan
 */

public class SeventhExercise {
    public static void coinFlipping(){
        if (Math.random() > 0.5){
            System.out.println("Tails");
        }
        else {
            System.out.println("Heads");
        }
    }
}
