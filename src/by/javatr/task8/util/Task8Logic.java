package by.javatr.task8.util;

public class Task8Logic
{
    public static double mathematicalFunction(double x) throws Exception
    {
        double result;

        if (x >= 3)
        {
            result = -x * x + 3 * x + 9;
        }
        else
        {
            double temp = Math.pow(x, 3) - 6;
            if (temp == 0)
            {
                throw new Exception("Dividing to zero...");
            }
            result = 1 / temp;
        }
        return result;
    }
}
