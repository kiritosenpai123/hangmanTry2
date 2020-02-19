package com.company;
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        int attempts = 10;
        int wordLength;
        boolean solved;
        Scanner userInput = new Scanner(System.in);


        System.out.println("OK Guessing Player ... turn around, while your friend enters the word to guess!\n");
        System.out.println("Other Player ‐ Enter your word (letters only, no repeated letters and not case sensitive):");

        String secretWord = userInput.next();


        // 20 blank spaces WITH a for loop, we're smart!
        for(int i = 1; i <= 20; i++)
            System.out.print("\n");


        Scanner userLetter = new Scanner(System.in);
        String letter;

        System.out.print("Word to date: ");
        for (int i = 0; i < secretWord.length(); i++)
        {
            System.out.print("*");
        }

        while (attempts <= 10 && attempts > 0)
        {
            System.out.println("\nAttempts left: " + attempts);
            System.out.print("Enter letter: ");

            attempts--;
        }

        System.out.println("\n---------------------------");
        System.out.println("Sorry you didn't find the mystery word!");
        System.out.println("It was \"" + secretWord + "\"");

    }
}
