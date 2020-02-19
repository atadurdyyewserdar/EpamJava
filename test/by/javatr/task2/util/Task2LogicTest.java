package by.javatr.task2.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2LogicTest
{

    @Test
    public void getDays_Test_Positive_Numbers() throws Exception
    {
        int month = 1;
        int year = 2020;
        int expected = 31;
        int actual = Task2Logic.getDays(month, year);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void getDays_Test_Negative_Numbers() throws Exception
    {
        int month = -1;
        int year = -2020;
        int expected = 0;
        int actual = Task2Logic.getDays(month,year);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDays_Test_Leap_Year() throws Exception
    {
        int month = 2;
        int year = 2020;
        int expected = 29;
        int actual = Task2Logic.getDays(month, year);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void getDays_Test_Wrong_Parameters() throws Exception
    {
        int month = 13;
        int year = 2020;
        int expected = 0;
        int actual = Task2Logic.getDays(month, year);
        Assert.assertEquals(expected, actual);
    }
}