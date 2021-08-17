
/**
 * Write a description of class FunctionsChallenge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FunctionsChallenge
{
    /******************************************************************************
    sumDouble

    Instructions:
    Given two int values, return their sum. Unless the two values are the same,
    then return double their sum.

    Examples:
    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8

     *******************************************************************************/

    public static int sumDouble(int a, int b) {

    }

    /******************************************************************************
    makes10

    Instructions:
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    Examples:
    makes10(9, 10) → true
    makes10(9, 9) → false
    makes10(1, 9) → true

     *******************************************************************************/

    public static boolean makes10(int a, int b) {
 
    }

    /******************************************************************************
    parrotTrouble

    Instructions:
    We have a loud talking parrot. The "talking" parameter is a boolean that
    represents if the parrot is talking. The "hour" parameter is the current hour
    time in the range 0..23. We are in trouble if the parrot is talking and the hour
    is before 7 or after 20. Return true if we are in trouble.

    Examples:
    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false
     *******************************************************************************/

    public static boolean parrotTrouble(boolean talking, int hour) {

    }

    /******************************************************************************
    alarmClock

    Instructions:
    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean
    indicating if we are on vacation, return a string of the form "7:00" indicating
    when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on
    the weekend it should be "10:00". Unless we are on vacation -- then on weekdays
    it should be "10:00" and weekends it should be "off".

    Examples:
    alarmClock(1, false) → "7:00"
    alarmClock(6, true) → "off"
    alarmClock(0, false) → "10:00"
     *******************************************************************************/

    public static String alarmClock(int day, boolean vacation) {

    }

    /******************************************************************************
    caughtSpeeding

    Instructions:
    You are driving a little too fast, and a police officer stops you. Write code
    to compute the result, encoded as a number value: 0=no ticket, 1=small ticket,
    2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61
    and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
    Unless it is your birthday -- on that day, your speed can be 5 higher in all
    cases.

    Examples:
    caughtSpeeding(60, false) → 0
    caughtSpeeding(65, false) → 1
    caughtSpeeding(65, true) → 0
     *******************************************************************************/

    public static int caughtSpeeding(int speed, boolean isBirthday) {

    }
}
