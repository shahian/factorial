package com.shahian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, c, fact = 1;
        System.out.println("enter an integer number to calculate");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n < 0) {
            System.out.println("number should grater than zero");

        } else {
            for (c = 1; c <= n; c++) {
                fact = fact * c;
                System.out.println("factorial of " + n + " is = " + fact);
            }

        }
    }
}
