package by.javatr.task6.util;

import org.junit.Assert;
import org.junit.Test;

public class Task6LogicTest
{
    @Test
    public void getHour_Test_Positive_Number() throws Exception
    {
        int a = 84200;
        int expected = 23;
        int actual = Task6Logic.getHour(a);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void getHour_Test_Positive_Wrong_Argument() throws Exception
    {
        int a = 86401;
        int expected = 0;
        int actual = Task6Logic.getHour(a);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = Exception.class)
    public void getHour_Test_Negative() throws Exception
    {
        int a = -84200;
        int expected = 0;
        int actual = Task6Logic.getHour(a);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinute_Test_Positive_Number() throws Exception
    {
        int a = 84200;
        int expected = 1403;
        int actual = Task6Logic.getMinute(a);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void getMinute_Test_Positive_Wrong_Argument() throws Exception
    {
        int a = 86401;
        int expected = 0;
        int actual = Task6Logic.getMinute(a);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = Exception.class)
    public void getMinute_Test_Negative() throws Exception
    {
        int a = -84200;
        int expected = 0;
        int actual = Task6Logic.getMinute(a);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSeconds_Test_Positive_Number() throws Exception
    {
        int a = 84200;
        int expected = 84200;
        int actual = Task6Logic.getSeconds(a);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void getSeconds_Test_Positive_Wrong_Argument() throws Exception
    {
        int a = 86401;
        int expected = 0;
        int actual = Task6Logic.getSeconds(a);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = Exception.class)
    public void getSeconds_Test_Negative() throws Exception
    {
        int a = -84200;
        int expected = 0;
        int actual = Task6Logic.getSeconds(a);
        Assert.assertEquals(expected, actual);
    }
}