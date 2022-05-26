package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fibonacci findterm = new Fibonacci();

        System.out.println();
        System.out.println("**** Note: the 1st term is considered 0 and the 2nd term is considered 1 ****");
        System.out.print("Enter the n value: ");
        Scanner sc = new Scanner(System.in);
        int numOfTerms = sc.nextInt();
        findterm.findValue(0,1, numOfTerms);

    }

}
