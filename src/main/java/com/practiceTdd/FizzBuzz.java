package com.practiceTdd;

public class FizzBuzz {

    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int RESULT = 0;

    public void print(int startNumber, int endNumber) {

        for(int number=startNumber;number<=endNumber;number++) {
            if(checkMultipleThreeAndFive(number)) {
                System.out.println("FizzBuzz");
            }
            else if(checkMultipleOfThree(number)) {
                System.out.println("Fizz");
            }
            else if(checkMultipleOfFive(number)) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(number);
            }
        }
    }

    public boolean checkMultipleThreeAndFive(int number) {
        return number%THREE==RESULT && number%FIVE==RESULT;
    }

    public boolean checkMultipleOfFive(int number) {
        return number%FIVE==RESULT;
    }

    public boolean checkMultipleOfThree(int number) {
        return number%THREE==RESULT;
    }

}
