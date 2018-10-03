package com.practiceTdd;

public class App {


    public static void main(String[] args) {

        System.out.println("FizzBuzz Task");
        int startNumber=1;
        int endNumber=100;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.print(startNumber, endNumber);


        System.out.println("Prime Number Task");
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.checkPrimeNUmber(100));


        System.out.println("Fibonacci Task");
        int input=10;
        int[] fibonacciSeriesResult;
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeriesResult = fibonacciSeries.printFibonacciSeries(input);

        for(int fibonacciNumber :fibonacciSeriesResult) {
            System.out.println(fibonacciNumber);
        }
    }
}
