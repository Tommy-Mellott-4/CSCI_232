package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fibonacci findterm = new Fibonacci();
        boolean cont = false;
        System.out.println();
        System.out.println("Fibonacci Sequence Calculator");
        try {
            Thread.sleep(500);
        } catch(InterruptedException ie){
            Thread.currentThread().interrupt();
        }
        while(cont != true) {
            System.out.println();
            System.out.println("** Type 'exit' to end the program");
            System.out.println();
            System.out.println("**** Note: the 1st term is considered 0 and the 2nd term is considered 1 ****");
            System.out.print("Enter the n value: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (Objects.equals(input, "exit")) {
                System.exit(0);
                cont = true;
            } else {
                int numOfTerms = Integer.parseInt(input);
                findterm.findValue(0, 1, numOfTerms);
            }
        }

    }

}
