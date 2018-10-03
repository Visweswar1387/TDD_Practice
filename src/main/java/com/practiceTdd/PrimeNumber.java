package com.practiceTdd;

public class PrimeNumber {
    public String checkPrimeNUmber(int input) {
        for(int i=2; i<input/2;i++) {
            if(input%i == 0) {
                return "Not Prime Number";
            }
        }
        return "Prime Number";
    }
}
