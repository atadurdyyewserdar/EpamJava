package by.javatr.task10.util;

import org.junit.Assert;
import org.junit.Test;

public class Task10LogicTest
{

    @Test(expected = Exception.class)
    public void getArray_Test_A_Bigger_B() throws Exception
    {
        double a = 10.0;
        double b = 1.0;
        double h = 2.0;
        double[] expected = {};
        double[] actual = Task10Logic.getArray(a, b, h);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void getArray_Test_H_Bigger_A_B() throws Exception
    {
        double a = 5.0;
        double b = 10.0;
        double h = 6;
        double[] expected = {};
        double[] actual = Task10Logic.getArray(a, b, h);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getArray_Test_Positive_Numbers() throws Exception
    {
        double a = 1.0;
        double b = 10.0;
        double h = 2.0;
        double[] expected = {1.557, -0.142, -3.38, 0.871, -0.452};
        double[] actual = Task10Logic.getArray(a, b, h);
        Assert.assertArrayEquals(expected, actual, 0.001);
    }

}