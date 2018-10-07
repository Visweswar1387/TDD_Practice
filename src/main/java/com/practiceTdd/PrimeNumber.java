package com.practiceTdd;

public class PrimeNumber {
    private static final int ZERO = 0;

    public String checkPrimeNumber(int input) {

        for(int number=2; number<=input/2;number++) {
            if(input%number == ZERO) {
                return "Not Prime Number";
            }
        }
        return "Prime Number";
    }
}
