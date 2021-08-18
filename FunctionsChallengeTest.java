

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class FunctionsChallengeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FunctionsChallengeTest
{

    /**
     * Default constructor for test class FunctionsChallengeTest
     */
    public FunctionsChallengeTest()
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
    public void sumDoubleTest()
    {
        assertEquals(3, FunctionsChallenge.sumDouble(1, 2));
        assertEquals(5, FunctionsChallenge.sumDouble(3, 2));
        assertEquals(8, FunctionsChallenge.sumDouble(2, 2));
        assertEquals(-1, FunctionsChallenge.sumDouble(-1, 0));
        assertEquals(12, FunctionsChallenge.sumDouble(3, 3));
        assertEquals(0, FunctionsChallenge.sumDouble(0, 0));
        assertEquals(1, FunctionsChallenge.sumDouble(0, 1));
        assertEquals(7, FunctionsChallenge.sumDouble(3, 4));
    }

    @Test
    public void makes10Test()
    {
        assertEquals(true, FunctionsChallenge.makes10(9, 10));
        assertEquals(false, FunctionsChallenge.makes10(9, 9));
        assertEquals(true, FunctionsChallenge.makes10(1, 9));
        assertEquals(true, FunctionsChallenge.makes10(10, 1));
        assertEquals(true, FunctionsChallenge.makes10(10, 10));
        assertEquals(true, FunctionsChallenge.makes10(8, 2));
        assertEquals(false, FunctionsChallenge.makes10(8, 3));
        assertEquals(true, FunctionsChallenge.makes10(10, 42));
        assertEquals(true, FunctionsChallenge.makes10(12, -2));
    }

    @Test
    public void parrotTroubleTest() 
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
    public void alarmClockTest() 
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
    public void caughtSpeedingTest() 
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
