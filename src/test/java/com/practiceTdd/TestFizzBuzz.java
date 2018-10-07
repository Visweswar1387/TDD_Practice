package com.practiceTdd;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {

    private FizzBuzz fizzBuzz;

    @Before
    public void initialise() {
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void shouldTestMultiplesOfThree() {

        Assert.assertEquals(true, fizzBuzz.checkMultipleOfThree(3));
    }

    @Test
    public void shouldTestMultiplesOfFive() {

        Assert.assertEquals(true, fizzBuzz.checkMultipleOfFive(5));
    }

    @Test
    public void shouldTestMultipleOfThreeAndFive() {

        Assert.assertEquals(true, fizzBuzz.checkMultipleThreeAndFive(15));
    }

}
