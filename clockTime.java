

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class clockTime.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class clockTime
{
    /**
     * Default constructor for test class clockTime
     */
    public clockTime()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    

    @Test
    public void ClockTimeCompare()
    {
    }

    @Test
    public void CompareClock()
    {
        ClockTime clockTim1 = new ClockTime(11, 01, 01);
        ClockTime clockTim2 = new ClockTime(11, 01, 01);
        TestClockTime.printEquals(clockTim1, clockTim2);
    }
}




