package com.shahian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        whithLoop();
        withRecursive();
    }

    private static void withRecursive() {
        int n;
        System.out.println("enter an integer number to calculate");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n < 0) {
            System.out.println("number should grater than zero");
        }
        System.out.println("factorial of " + n + " is :" + factorial(n));
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else
            return (n * factorial(n - 1));

    }

    private static void whithLoop() {
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
