package by.javatr.task6.util;

public class Task6Logic
{
    public static int getHour(int seconds) throws Exception
    {
        if (seconds < 0 || seconds > 86400)
        {
            throw new Exception("Wrong argument...");
        }
        return seconds / 3600;
    }

    public static int getMinute(int seconds) throws Exception
    {
        if (seconds < 0 || seconds > 86400)
        {
            throw new Exception("Wrong argument...");
        }
        return seconds / 60;
    }

    public static int getSeconds(int seconds) throws Exception
    {
        if (seconds < 0 || seconds > 86400)
        {
            throw new Exception("Wrong argument...");
        }
        return seconds;
    }
}
