package wk03;

import java.util.Scanner;

/**
 * CST231 — Rock-Paper-Scissors Walkthrough (with nested conditionals)
 * ----------------------------------------------------
 * This file introduces conditionals using a simple game.
 * Each stage is commented out — uncomment one stage at a time to run it.
 */

 /*
 RPS 1–2: input + optional normalization; review .equals vs ==; show debugger!.
 RPS 3: outer branches only; echo messages per branch.
 RPS 4: add inner decisions; test several combos live.
 RPS 5: show flat chain; compare to nested for readability.
 RPS 6: quick guard-clause pattern with return; (aligns with HW Part 2b).
  */
public class RPS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ───────────────────────────────────────────────────────────────
        // RPS 1: Get choices (Strings) and echo back
        // Players type: rock, paper, or scissors.
        // Reminder: compare Strings with .equals(), not ==
        System.out.print("Player 1, enter rock, paper, or scissors: ");
        String p1 = in.next();

        System.out.print("Player 2, enter rock, paper, or scissors: ");
        String p2 = in.next();

        System.out.println("Player 1 chose " + p1);
        System.out.println("Player 2 chose " + p2);


        // ───────────────────────────────────────────────────────────────
        // RPS 2: Normalize inputs to lowercase
        // This way "Rock" or "ROCK" works the same as "rock".
        // Uncomment the echo block above first, then add this step.
        p1 = p1.toLowerCase();
        p2 = p2.toLowerCase();


        // ───────────────────────────────────────────────────────────────
        // RPS 3: Outer decision on Player 1's move
        // We are not deciding winners yet, just sorting into branches.
        if (p1.equals("rock")) {
            System.out.println("P1 chose rock (outer branch).");
             } else if (p1.equals("paper")) {
            System.out.println("P1 chose paper (outer branch).");
        } else if (p1.equals("scissors")) {
            System.out.println("P1 chose scissors (outer branch).");
        } else {
            System.out.println("Invalid input by Player 1.");
        }

        // ───────────────────────────────────────────────────────────────
        // RPS 4: Nested decisions — inner if/else based on Player 2
        // Only one outer branch runs; inside it, exactly one inner branch runs.
        if (p1.equals("rock")) {
            if (p2.equals("scissors")) {
                System.out.println("Player 1 wins! rock smashes scissors");
            } else if (p2.equals("paper")) {
                System.out.println("Player 2 wins! paper covers rock");
            } else if (p2.equals("rock")) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("Invalid input by Player 2.");
            }
        } else if (p1.equals("paper")) {
            if (p2.equals("rock")) {
                System.out.println("Player 1 wins! paper covers rock");
            } else if (p2.equals("scissors")) {
                System.out.println("Player 2 wins! scissors cut paper");
            } else if (p2.equals("paper")) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("Invalid booger input by Player 2.");
            }
        } else if (p1.equals("scissors")) {
            if (p2.equals("paper")) {
                System.out.println("Player 1 wins! scissors cut paper");
            } else if (p2.equals("rock")) {
                System.out.println("Player 2 wins! rock smashes scissors");
            } else if (p2.equals("scissors")) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("Invalid input by Player 2.");
            }
        } else {
            System.out.println("Invalid input by Player 1.");
        }

// ───────────────────────────────────────────────────────────────
// RPS 5: Flat chain version (no nesting)
// Same rules as above, but written as one big if/else-if chain
// Use this after nested version to compare readability.

//        if (p1.equals(p2)) {
//            System.out.println("It's a tie!");
//        } else if (p1.equals("rock") && p2.equals("scissors")) {
//            System.out.println("Player 1 wins! rock smashes scissors");
//        } else if (p1.equals("scissors") && p2.equals("rock")) {
//            System.out.println("Player 2 wins! rock smashes scissors");
//        } else if (p1.equals("paper") && p2.equals("rock")) {
//            System.out.println("Player 1 wins! paper covers rock");
//        } else if (p1.equals("rock") && p2.equals("paper")) {
//            System.out.println("Player 2 wins! paper covers rock");
//        } else if (p1.equals("scissors") && p2.equals("paper")) {
//            System.out.println("Player 1 wins! scissors cut paper");
//        } else if (p1.equals("paper") && p2.equals("scissors")) {
//            System.out.println("Player 2 wins! scissors cut paper");
//        } else {
//            System.out.println("Invalid input. Please type rock, paper, or scissors.");
//        }


//  ───────────────────────────────────────────────────────────────
//  RPS 6: Early exit (guard clause style)
//  Check for invalid input first, then return to end program.
//  This mirrors how you will handle errors in homework.
//     boolean validP1 = p1.equals("rock") || p1.equals("paper") || p1.equals("scissors");
//     boolean validP2 = p2.equals("rock") || p2.equals("paper") || p2.equals("scissors");
//
//     if (!validP1 || !validP2) {
//     System.out.println("Invalid input: please type rock, paper, or scissors.");
//     return;
//     }
//  After this check passes, run either nested or flat version above


    }
}