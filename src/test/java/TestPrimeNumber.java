import com.practiceTdd.PrimeNumber;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class TestPrimeNumber {

    private PrimeNumber primeNumber;
    @Before
    public void initialise() {
        primeNumber = new PrimeNumber();
    }
    @Test
    @Parameters({
            "2, Prime Number",
            "3, Prime Number",
            "5, Prime Number",
            "7, Prime Number",
            "9, Not Prime Number",
            "100, Not Prime Number",
            "500, Not Prime Number",
            "1000, Not Prime Number",
            "1500, Not Prime Number",
            "2000, Not Prime Number"
    })
    public void shouldTestPrimeNumber(int input , String result) {

        Assert.assertEquals(result, primeNumber.checkPrimeNUmber(input));
    }
}
