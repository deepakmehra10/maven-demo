package com.knoldus;

import java.util.Scanner;

public class AppDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Add add = new Add();
        System.out.println("Enter first number");
        int first = scanner.nextInt();
        System.out.println("Enter second number");
        int second = scanner.nextInt();
        System.out.println("===================================");
        System.out.println("Result " + add.addTwoNumbers(first, second));
        System.out.println("===================================");
    }
}
