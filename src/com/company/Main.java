package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fibonacci findterm = new Fibonacci();
        System.out.println();
        System.out.print("Enter the n value: ");
        Scanner sc = new Scanner(System.in);
        int numOfTerms = sc.nextInt();
        findterm.findValue(0,1, numOfTerms);

    }

}
