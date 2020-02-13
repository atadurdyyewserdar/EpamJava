package by.javatr.task9.util;

public class Task9Logic
{
    public static double getLength(double R) throws Exception
    {
        if (R < 0)
        {
            throw new Exception("Wrong argument... (R < 0)");
        }
        return 2 * Math.PI * R;
    }

    public static double getSquare(double R) throws Exception
    {
        if (R < 0)
        {
            throw new Exception("Wrong argument... (R < 0)");
        }
        return Math.PI * R * R;
    }
}
