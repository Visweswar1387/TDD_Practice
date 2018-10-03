package com.practiceTdd;

public class FizzBuzz {
    public void print(int startNumber, int endNumber) {

        for(int printNumber=startNumber;printNumber<=endNumber;printNumber++) {
            if(checkMultipleThreeAndFive(printNumber)) {
                System.out.println("FizzBuzz");
            }
            else if(checkMultipleOfThree(printNumber)) {
                System.out.println("Fizz");
            }
            else if(checkMultipleOfFive(printNumber)) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(printNumber);
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
