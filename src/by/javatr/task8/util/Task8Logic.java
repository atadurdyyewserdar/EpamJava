package by.javatr.task8.util;

public class Task8Logic
{
    public static double mathematicalFunction(double x)
    {
        if (x >= 3)
        {
            return -x * x + 3 * x + 9;
        } else
        {
            return 1 / (Math.pow(x, 3) - 6);
        }
    }
}
