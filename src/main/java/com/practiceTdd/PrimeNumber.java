package com.practiceTdd;

public class PrimeNumber {

    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    public String checkPrimeNumber(int input) {

        if(input>ONE) {

            for (int number = TWO; number <= input / TWO; number++) {
                if (input % number == ZERO) {
                    return "Not Prime Number";
                }
            }
            return "Prime Number";
        }
        else {
            return "Prime number should be greater than one";
        }
    }
}
