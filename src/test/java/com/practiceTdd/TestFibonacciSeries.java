package com.practiceTdd;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class TestFibonacciSeries {

    private FibonacciSeries fibonacciSeries;

    @Before
    public void initialise() {
        fibonacciSeries = new FibonacciSeries();
    }

    private int result[]= {1,1,2,3,5,8,13,21,34,55};
    @Test
    @Parameters({
            "10"
    })
    public  void shouldTestFibonacciSeries(int input) {

        Assert.assertArrayEquals(result, fibonacciSeries.printFibonacciSeries(input));
    }
}
