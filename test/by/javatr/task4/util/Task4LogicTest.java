package by.javatr.task4.util;

import org.junit.Assert;
import org.junit.Test;


public class Task4LogicTest
{
    @Test
    public void ifExistsTwoEven_Test_Positive_Numbers_Result_True(){
        int a = 1, b = 2, c = 3, d = 4;
        boolean expected = true;
        boolean actual = Task4Logic.ifExistsTwoEven(a,b,c,d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifExistsTwoEven_Test_Positive_Numbers_Result_False(){
        int a = 1, b = 2, c = 3, d = 3;
        boolean expected = false;
        boolean actual = Task4Logic.ifExistsTwoEven(a,b,c,d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifExists_Test_Two_Even_Negative_Numbers(){
        int a = -1, b = -2, c = -3, d = -4;
        boolean expected = true;
        boolean actual = Task4Logic.ifExistsTwoEven(a,b,c,d);
        Assert.assertTrue(actual);
    }

    @Test(expected = Exception.class)
    public void ifExistsTwoEven_Test_Argument_Null(){
        int[] arr = null;
        boolean expected = false;
        boolean actual = Task4Logic.ifExistsTwoEven(arr);
        Assert.assertEquals(expected, actual);
    }
}