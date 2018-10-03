import com.practiceTdd.FizzBuzz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.runner.RunWith;
@RunWith(JUnitParamsRunner.class)

public class TestFizzBuzz {

    private FizzBuzz fizzBuzz;

    @Before
    public void initialise() {
        fizzBuzz = new FizzBuzz();
    }
    @Test
    @Parameters({
            "3, true",
            "13, false"
    })
    public void shouldTestMultiplesOfThree(int input, boolean result) {

        Assert.assertEquals(result, fizzBuzz.checkMultipleOfThree(input));
    }

    @Test
    @Parameters({
            "50, true",
            "13, false",
            "15, true"
    })
    public void shouldTestMultiplesOfFive(int input, boolean result) {

        Assert.assertEquals(result, fizzBuzz.checkMultipleOfFive(input));
    }

    @Test
    @Parameters({
            "15, true",
            "30, true",
            "45, true",
            "60, true",
            "75, true",
            "90, true"
    })
    public void shouldTestMultipleOfThreeAndFive(int input, boolean result) {

        Assert.assertEquals(result, fizzBuzz.checkMultipleThreeAndFive(input));
    }

}
