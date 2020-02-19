package by.javatr.task9.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task9LogicTest
{

    @Test
    public void getLength_Test_Positive_Argument() throws Exception
    {
        double R = 10.0;
        double expected = 62.831;
        double actual = Task9Logic.getLength(R);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test(expected = Exception.class)
    public void getLength_Test_Wrong_Argument() throws Exception
    {
        double R = -10.0;
        double expected = 0.0;
        double actual = Task9Logic.getLength(R);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test(expected = Exception.class)
    public void getSquare_Test_Wrong_Argument() throws Exception
    {
        double R = -10.0;
        double expected = 0.0;
        double actual = Task9Logic.getSquare(R);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void getSquare_Test_Positive_Argument() throws Exception
    {
        double R = 10.0;
        double expected = 314.159;
        double actual = Task9Logic.getSquare(R);
        Assert.assertEquals(expected, actual, 0.001);
    }
}