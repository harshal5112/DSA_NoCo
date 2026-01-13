package org.example.Patterns_p1;

import java.util.Scanner;

public class ReversePattern {
    public static void RevStar(int n) {

        for (int line = 1; line<=n; line++ ){
            for (int star=1;star<=n-line+1;star++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Rows: ");
        n = sc.nextInt();
        RevStar(n);
    }
}
