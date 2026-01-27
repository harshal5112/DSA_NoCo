package org.example.Patterns_p1;

import java.util.Scanner;

public class DiamondPattern {

    public static void printDiamond(int n) {

        // 🔺 Upper Half
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            // Stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // 🔻 Lower Half
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            // Stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        printDiamond(n);

        sc.close();
    }
}
