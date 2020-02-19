package by.javatr.task1.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1LogicTest
{
    @Test
    public void getLastNumber_Test_Positive_Number()
    {
        int a = 22;
        int expected  = 4;
        int actual = Task1Logic.getLastNumber(a);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastNumber_Test_Negative_Numbers()
    {
        int a = -22;
        int expected  = 4;
        int actual = Task1Logic.getLastNumber(a);
        Assert.assertEquals(expected, actual);
    }
}