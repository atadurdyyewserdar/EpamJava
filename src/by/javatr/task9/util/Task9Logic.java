package by.javatr.task9.util;

public class Task9Logic
{
    public static double getLength(double R)
    {
        if (R < 0) return -1;
        return 2 * 3.14 * R;
    }

    public static double getSquare(double R)
    {
        if (R < 0) return -1;
        return 3.14 * R * R;
    }
}
