package org.example.Patterns_p1;
import java.util.Scanner;

public class StarPattern {
    public static void Star( int n) {

        for (int i = 1; i <= n; i++) { // This outer loop print the no of Rows
            for (int star = 1; star <= i; star++) { // print no fo Star
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
    }

    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Rows: ");
        n = sc.nextInt();
        Star(n);
    }
}

/*

Output- if n=4
 *
 * *
 * * *
 * * * *

 */