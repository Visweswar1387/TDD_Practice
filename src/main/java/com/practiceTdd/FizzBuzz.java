package com.practiceTdd;

public class FizzBuzz {


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

    public boolean checkMultipleThreeAndFive(int printNumber) {
        if (printNumber%3==0 && printNumber%5==0) {
            return true;
        }
        return false;
    }

    public boolean checkMultipleOfFive(int printNumber) {
        if (printNumber%5==0) {
            return true;
        }
        return false;
    }

    public boolean checkMultipleOfThree(int printNumber) {
        if (printNumber%3==0) {
            return true;
        }
        return false;
    }

}
