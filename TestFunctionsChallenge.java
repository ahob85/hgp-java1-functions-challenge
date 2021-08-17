
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

/**
 * The test class TestFunctionsChallenge.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestFunctionsChallenge
{

    /**
     * Default constructor for test class TestFunctionsChallenge
     */
    public TestFunctionsChallenge()
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
    public void test_sumDouble()
    {
        assertEquals(FunctionsChallenge.sumDouble(1, 2), 3);
        assertEquals(FunctionsChallenge.sumDouble(3, 2), 5);
        assertEquals(FunctionsChallenge.sumDouble(2, 2), 8);
        assertEquals(FunctionsChallenge.sumDouble(-1, 0), -1);
        assertEquals(FunctionsChallenge.sumDouble(3, 3), 12);
        assertEquals(FunctionsChallenge.sumDouble(0, 0), 0);
        assertEquals(FunctionsChallenge.sumDouble(0, 1), 1);
        assertEquals(FunctionsChallenge.sumDouble(3, 4), 7);
    }

    @Test
    public void test_makes10()
    {
        assertEquals(FunctionsChallenge.makes10(9, 10), true);
        assertEquals(FunctionsChallenge.makes10(9, 9), false);
        assertEquals(FunctionsChallenge.makes10(1, 9), true);
        assertEquals(FunctionsChallenge.makes10(10, 1), true);
        assertEquals(FunctionsChallenge.makes10(10, 10), true);
        assertEquals(FunctionsChallenge.makes10(8, 2), true);
        assertEquals(FunctionsChallenge.makes10(8, 3), false);
        assertEquals(FunctionsChallenge.makes10(10, 42), true);
        assertEquals(FunctionsChallenge.makes10(12, -2), true);
    }

    @Test
    public void test_parrotTrouble() 
    {
        assertEquals(true, FunctionsChallenge.parrotTrouble(true, 6));
        assertEquals(false, FunctionsChallenge.parrotTrouble(true, 7));
        assertEquals(false, FunctionsChallenge.parrotTrouble(false, 6));
        assertEquals(true, FunctionsChallenge.parrotTrouble(true, 21));
        assertEquals(false, FunctionsChallenge.parrotTrouble(false, 21));
        assertEquals(false, FunctionsChallenge.parrotTrouble(false, 20));
        assertEquals(true, FunctionsChallenge.parrotTrouble(true, 23));
        assertEquals(false, FunctionsChallenge.parrotTrouble(false, 23));
        assertEquals(false, FunctionsChallenge.parrotTrouble(true, 20));
        assertEquals(false, FunctionsChallenge.parrotTrouble(false, 12));
    }

    @Test
    public void test_alarmClock() 
    {
        assertEquals("7:00", FunctionsChallenge.alarmClock(1, false));
        assertEquals("7:00", FunctionsChallenge.alarmClock(5, false));
        assertEquals("10:00", FunctionsChallenge.alarmClock(0, false));
        assertEquals("10:00", FunctionsChallenge.alarmClock(6, false));
        assertEquals("off", FunctionsChallenge.alarmClock(0, true));
        assertEquals("off", FunctionsChallenge.alarmClock(6, true));
        assertEquals("10:00", FunctionsChallenge.alarmClock(1, true));
        assertEquals("10:00", FunctionsChallenge.alarmClock(3, true));
        assertEquals("10:00", FunctionsChallenge.alarmClock(5, true));
    }

    @Test
    public void test_caughtSpeeding() 
    {
        assertEquals(0, FunctionsChallenge.caughtSpeeding(60, false));
        assertEquals(1, FunctionsChallenge.caughtSpeeding(65, false));
        assertEquals(0, FunctionsChallenge.caughtSpeeding(65, true));
        assertEquals(1, FunctionsChallenge.caughtSpeeding(80, false));
        assertEquals(2, FunctionsChallenge.caughtSpeeding(85, false));
        assertEquals(1, FunctionsChallenge.caughtSpeeding(85, true));
        assertEquals(1, FunctionsChallenge.caughtSpeeding(70, false));
        assertEquals(1, FunctionsChallenge.caughtSpeeding(75, false));
        assertEquals(1, FunctionsChallenge.caughtSpeeding(75, true));
        assertEquals(0, FunctionsChallenge.caughtSpeeding(40, false));
        assertEquals(0, FunctionsChallenge.caughtSpeeding(40, true));
        assertEquals(2, FunctionsChallenge.caughtSpeeding(90, false));
    }
}
