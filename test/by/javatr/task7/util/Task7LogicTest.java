package by.javatr.task7.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task7LogicTest
{
    @Test
    public void findClosest_Test_Positive_Number()
    {
        int x1 = 5;
        int y1 = 5;
        int x2 = 6;
        int y2 = 6;
        String expected = "A(x1, y1)";
        String actual = Task7Logic.findClosest(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual);
    }
}