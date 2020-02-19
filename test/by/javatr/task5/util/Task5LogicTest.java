package by.javatr.task5.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task5LogicTest
{

    @Test
    public void isPerfectNumberPositiveNumber()
    {
        int a = 28;
        boolean expected = true;
        boolean actual = Task5Logic.isPerfectNumber(a);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPerfectNumber_Test_Negative_Number()
    {
        int a = -28;
        boolean expected = false;
        boolean actual = Task5Logic.isPerfectNumber(a);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPerfectNumber_Test_Positive_Number_Result_False()
    {
        int a = 20;
        boolean expected = false;
        boolean actual = Task5Logic.isPerfectNumber(a);
        Assert.assertEquals(expected, actual);
    }
}