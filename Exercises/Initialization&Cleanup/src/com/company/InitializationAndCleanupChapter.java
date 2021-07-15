package com.company;

/**
 * Description: This class is designed for covering the most part of the exercises from the ThinkingInJava4e book.
 * Each exercise represents a static class and each description of exercise is written above
 * the method.
 * Chapter:     Initialization and Cleanup
 *
 * @author Argishti_tigranyan
 */

public class InitializationAndCleanupChapter {

    /*
     * Exercise:    5
     * Description: Create a class called Dog with an overloaded bark( ) method. This
     *              method should be overloaded based on various primitive data types, and print different types
     *              of barking, howling, etc., depending on which overloaded version is called. Write a main( )
     *              that calls all the different versions.
     */

    static class Dog {

        public static void bark() {
            System.out.println("lowest 'haf' ");
        }

        public static void bark(byte quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks < 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("lower 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(short quantityOfBarks) {
            if (quantityOfBarks < 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("low 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(int quantityOfBarks) {
            if (quantityOfBarks < 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("haf ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(long quantityOfBarks) {
            if (quantityOfBarks < 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("high 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }
    }

    /*
     * Exercise:    6
     * Description: Modify the previous exercise so that two of the overloaded methods have
     *              two arguments (of two different types), but in reversed order relative to each other. Verify
     *              that this works.
     *
     */

    static class ModifiedDog {
        public static void bark() {
            System.out.println("lowest 'haf' ");
        }

        public static void bark(byte quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("lower 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(short quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("low 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(int quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("haf ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(long quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            while (quantityOfBarks > 0) {
                System.out.print("high 'haf' ");
                quantityOfBarks--;
            }
            System.out.println();
        }

        public static void bark(boolean hafOrBark, int quantityOfBarks) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            if (hafOrBark) {
                while (quantityOfBarks > 0) {
                    System.out.print("haf ");
                    quantityOfBarks--;
                }
            } else {
                while (quantityOfBarks > 0) {
                    System.out.print("bark ");
                    quantityOfBarks--;
                }
            }
            System.out.println();
        }

        public static void bark(int quantityOfBarks, boolean barkOrHaf) throws IllegalArgumentException {
            if (quantityOfBarks <= 0) {
                throw new IllegalArgumentException("a dog can not bark negative times");
            }
            if (barkOrHaf) {
                while (quantityOfBarks > 0) {
                    System.out.print("bark ");
                    quantityOfBarks--;
                }
            } else {
                while (quantityOfBarks > 0) {
                    System.out.print("haf ");
                    quantityOfBarks--;
                }
            }
            System.out.println();
        }
    }

    /*
     * Exercise:    9
     * Description: Create a class with two (overloaded) constructors. Using this, call the
     *              second constructor inside the first one.
     *
     */

    static class ConstructorOverloading{

        String firstName;
        String lastName;

        ConstructorOverloading(String firstName, String lastName){
            this(firstName);
            this.lastName = lastName;
            System.out.println("Last name: "+this.lastName);
        }

        ConstructorOverloading(String firstName){
            this.firstName = firstName;
            System.out.println("First name: "+this.firstName);
        }
    }

}