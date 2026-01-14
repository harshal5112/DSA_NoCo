package org.example.Patterns_p1;

import java.util.Scanner;

public class HalfPyramid {
    public static void Halfpyramid(int n) {

    for (int line =1;line<=n;line++){
        for (int num=1;num<=line;num++){
            System.out.print(num);
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Rows: ");
        n = sc.nextInt();
        Halfpyramid(n);
    }
}
