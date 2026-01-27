package org.example.Patterns_p1;

import java.util.Scanner;

public class SolidRhombus {
    public static void printSolidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Spaces (shift right)
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }
            // Stars (fixed count)
            for (int star = 1; star <= n; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        printSolidRhombus(n);

        sc.close();
    }
}

/*
Enter number of rows: 5
        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *

 */
