package com.company;

import java.util.Random;
import java.util.Scanner;

        public class Main {


            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);


                System.out.println("Enter 1 for singleplayer and 2 for multiplayer");
                int choice = input.nextInt();
                if (choice == 1) {
                    singleplayerRules(choice);
                }

            }

            public static void singleplayerRules(int choice) {
                Scanner input = new Scanner(System.in);
                Random r = new Random();

                String[] array = {"germany", "japan", "bulgaria", "england", "serbia"};

                String word = array[r.nextInt(array.length)];
                int count = word.length();
                char[] CharrArr = word.toCharArray();
                char[] dash = word.toCharArray();

                for (int i = 0; i < dash.length; i++) {
                    dash[i] = '_';
                    System.out.print(dash[i] + " ");
                }

                for (int i = 1; i <= 10; i++) {
                    System.out.println("Try to guess a letter! ");
                    char letter = input.next().charAt(0);

                    for (int j = 0; j < CharrArr.length; j++) {
                        if (letter == dash[j]) {
                            System.out.println("This letter already exists");
                            System.out.println();

                        } else {
                            if (letter == CharrArr[j]) {
                                dash[j] = letter;
                                i--;
                                System.out.println("Correct guess!");
                                System.out.println();
                            }
                        }
                    }
                    System.out.println(dash);
                    switch (i) {
                        case 1:
                            System.out.println();
                            System.out.println();
                            System.out.println("|");
                            break;
                        case 2:
                            System.out.println();
                            System.out.println("|");
                            System.out.println("|");
                            break;
                        case 3:
                            System.out.println();
                            System.out.println("|");
                            System.out.println("|");
                            System.out.println("|");
                            break;
                        case 4:
                            System.out.println();
                            System.out.println(" _");
                            System.out.println("|");
                            System.out.println("|");
                            System.out.println("|");
                            break;
                        case 5:
                            System.out.println();
                            System.out.println(" __");
                            System.out.println("|");
                            System.out.println("|");
                            System.out.println("|");
                            break;
                        case 6:
                            System.out.println();
                            System.out.println(" ___");
                            System.out.println("|");
                            System.out.println("|");
                            System.out.println("|");
                            break;
                        case 7:
                            System.out.println();
                            System.out.println(" ___");
                            System.out.println("|   |");
                            System.out.println("|");
                            System.out.println("|");
                            break;
                        case 8:
                            System.out.println(" ___");
                            System.out.println("|   |");
                            System.out.println("|   O");
                            System.out.println("|");
                            break;
                        case 9:
                            System.out.println(" ___");
                            System.out.println("|   O");
                            System.out.println("|  \\ /");
                            System.out.println("|  ");
                            break;
                        case 10:
                            System.out.println(" ___");
                            System.out.println("|   |");
                            System.out.println("|   O");
                            System.out.println("|  \\ /");
                            System.out.println("|  / \\");
                            System.out.println("You're out!!");
                            break;
                    }
                    System.out.print("");

                    if ((new String(word)).equals(new String(dash))) {
                        System.out.println("Congratulations! YOU WIN! \n");
                        break;
                    }
                }
            }
        }


