package com.practiceTdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestPrimeNumber {

    private PrimeNumber primeNumber;
    @Before
    public void initialise() {
        primeNumber = new PrimeNumber();
    }


    @Test
    public void shouldTestInputGreaterThanOne() {

        Assert.assertEquals("Prime Number", primeNumber.checkPrimeNumber(1));
    }

    @Test
    public void shouldTestPrimeNumber() {

        Assert.assertEquals("Prime Number", primeNumber.checkPrimeNumber(2));
    }
    @Test
    public void shouldTestNonPrimeNumber() {

        Assert.assertEquals("Not Prime Number", primeNumber.checkPrimeNumber(4));
    }
}
