package com.company;


public class Fibonacci {

    private int n = 2;

    public Fibonacci(){
    }


    public void findValue(int twoPrior, int onePrior, int numOfTerms){
        if(numOfTerms == 1){
            System.out.println(twoPrior);
            return;
        }else if(numOfTerms == 2){
            System.out.println(onePrior);
            return;
        }
        n++;
        if(n == numOfTerms){
            System.out.println((onePrior+twoPrior));
            return;
        } else{
            findValue(onePrior,(onePrior+twoPrior), numOfTerms);
        }



    }

}
