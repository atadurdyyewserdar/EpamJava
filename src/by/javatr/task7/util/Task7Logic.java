package by.javatr.task7.util;

public class Task7Logic
{
    public static String findClosest(int x1, int y1, int x2, int y2)
    {
        if (Math.sqrt((x1 * x1) + (y1 * y1)) > Math.sqrt((x2 * x2) + (y2 * y2)))
        {
            return "A(x1, y2)";
        }
        return "B(x2, y2)";
    }
}
