package by.javatr.task6.util;

public class Task6Logic
{
    public static int getHour(int seconds)
    {
        if (seconds < 0 || seconds > 86400)
        {
            return -1;
        }
        return seconds / 3600;
    }

    public static int getMinute(int seconds)
    {
        if (seconds < 0 || seconds > 86400)
        {
            return -1;
        }
        return seconds / 60;
    }

    public static int getSeconds(int seconds)
    {
        if (seconds < 0 || seconds > 86400)
        {
            return -1;
        }
        return seconds;
    }
}
