package com.bilgee.demo;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner( System.in );
    public static void main(String[] args) {

    // TODO- JavaB_Lektion_3_Menu_Switch



        System.out.println("1. weekdaySwitch 2. scoreSwitch 0. to EXIT");

        do {
            System.out.println("You are in MAIN MENU:");
            switch (scan.nextLine()) {
                case "1"-> weekdaySwitch();
                case "2"-> scoreSwitch();
                case "0"-> System.exit( 0 );
            }
        }while (true);

    }
    public static void scoreSwitch () {
        // Section #2
        // Return example
        //Scanner scan = new Scanner( System.in );
        System.out.println("Add 1. score or 2.");

        int score = switch (scan.nextInt()) {
            case 1 -> {
                System.out.println( "You pressed 1 " );

                yield 1;
            }
            case 2 -> {
                System.out.println( "You pressed 2 " );

                yield 2;
            }
            default -> throw new IllegalStateException("Try again" + scan.nextInt());

        };
        System.out.println(score);
    }

    public static void weekdaySwitch () {
        // Section #1
        //Scanner scan = new Scanner( System.in );

        System.out.println("What day of the week do you want?");

        switch (scan.nextLine()) {
            case "1"-> System.out.println( "Monday" );
            case "2" -> System.out.println( "Tuesday" );
            case "3" -> System.out.println( "Wednesday" );
            case "4" -> System.out.println( "Thursday" );
            case "5" -> System.out.println( "Friday" );
            // case 5,6,7,8 -> System.out.println( "Friday" );

            default -> {
                System.out.println( "Weekend" );
                System.out.println("Weeeeeeeeeeeeeeeeeeeeeekend");
            }
        }
    }
}

