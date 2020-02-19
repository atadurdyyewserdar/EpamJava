package by.javatr.task8.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task8LogicTest
{

    @Test
    public void mathematicalFunction_Test_Number_Less_3()
    {
        double a = 2.0;
        double expected = 0.5;
        double actual = Task8Logic.mathematicalFunction(a);
        Assert.assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void mathematicalFunction_Test_Number_Bigger_Equal_3()
    {
        double a = 3;
        double expected = 9.0;
        double actual = Task8Logic.mathematicalFunction(a);
        Assert.assertEquals(expected, actual, 0.000001);
    }
}