package com.company;

import java.util.Scanner; // allows to get input from user
import java.util.Random; // allows to generate random numbers
import  java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in); // makes Scanner class to be able to use it
        Random rand = new Random();

        System.out.println("How many sides would you like your dice to have? (0 included)");
        int diceSides = input.nextInt(); // gets amount of sides on dice from user

        System.out.println("How many times would you like to throw the dice?");
        int rolls = input.nextInt(); // gets amount of rolls to do on dice from user

        for (int i = 0; i < rolls; i++) {
            int numRolled = rand.nextInt(diceSides+1);
            System.out.println(numRolled);
        }
    }
}
