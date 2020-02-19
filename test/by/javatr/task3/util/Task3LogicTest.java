package by.javatr.task3.util;

import org.junit.Assert;
import org.junit.Test;

public class Task3LogicTest
{
    @Test
    public void getResult_Test_Positive_Number() throws Exception
    {
        double a = 10;
        double expected= 5.000000000000001;
        double actual = Task3Logic.getResult(a);
        Assert.assertEquals(expected, actual, 0.0000001);
    }

    @Test(expected = Exception.class)
    public void getResult_Test_Negative_Number() throws Exception
    {
        double a = -1;
        double expected= 0.0;
        double actual = Task3Logic.getResult(a);
        Assert.assertEquals(expected, actual, 0.0000001);
    }

    @Test
    public void getCompare_Test_Result_Positive_Numbers() throws Exception
    {
        double s = 1;
        double s2 = 0.5;
        double expected = 2;
        double actual = Task3Logic.getCompareResult(s,s2);
        Assert.assertEquals(expected, actual, 0.0000001);
    }

    @Test
    public void getCompare_Test_Result_Negative_Numbers() throws Exception
    {
        double s = -2;
        double s2 = -4;
        double expected= 0.5;
        double actual = Task3Logic.getCompareResult(s,s2);
        Assert.assertEquals(expected, actual, 0.0000001);
    }

    @Test(expected = Exception.class)
    public void getCompare_Test_Left_Less_Than_Right() throws Exception
    {
        double s = -4;
        double s2 = -2;
        double expected = 0.0;
        double actual = Task3Logic.getCompareResult(s,s2);
        Assert.assertEquals(expected, actual, 0.0000001);
    }
}