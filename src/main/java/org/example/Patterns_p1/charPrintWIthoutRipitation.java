package org.example.Patterns_p1;

import java.util.Scanner;

public class charPrintWIthoutRipitation {
    public static void pattern(int n) {
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows: ");
        n = sc.nextInt();
        pattern(n);
    }
}

