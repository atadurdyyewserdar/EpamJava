package by.javatr.task10.util;

public class Task10Logic
{
    public static double[] getArray(double a, double b, double h) throws Exception
    {
        if (a > b || h > b - a)
        {
            throw new Exception("Wrong argument...");
        }

        int length = (int) Math.ceil((b - a) / h);
        double[] mas = new double[length];
        int k = 0;

        for (double i = a; i <= b; i += h)
        {
            mas[k] = Math.tan(i);
            k++;
        }

        return mas;
    }
}
