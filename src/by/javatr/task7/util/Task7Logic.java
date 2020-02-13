package by.javatr.task7.util;

public class Task7Logic
{
    public static String findClosest(int x1, int y1, int x2, int y2)
    {
        String result = "";

        double a = Math.sqrt((x1 * x1) + (y1 * y1));
        double b = Math.sqrt((x2 * x2) + (y2 * y2));

        if (a < b)
        {
            result = "A(x1, y1)";
        }
        else if (a == b)
        {
            result = "A(x1, y1) = B(x2, y2)";
        }
        else
        {
            result = "B(x2, y2)";
        }
        return result;
    }
}
