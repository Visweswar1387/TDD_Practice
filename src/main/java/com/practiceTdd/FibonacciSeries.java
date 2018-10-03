package com.practiceTdd;

public class FibonacciSeries {
    public int[] printFibonacciSeries(int input) {
        int firstFibonacciNumber=1;
        int secondFibonacciNumber=1;

        int fibonacciSeries[] = new int[input];

        fibonacciSeries[0]=firstFibonacciNumber;
        fibonacciSeries[1]=secondFibonacciNumber;

        for(int i =2; i<fibonacciSeries.length;i++) {
            fibonacciSeries[i]=fibonacciSeries[i-1]+fibonacciSeries[i-2];
        }
        return fibonacciSeries;
    }
}
