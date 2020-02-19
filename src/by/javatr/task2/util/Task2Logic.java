package by.javatr.task2.util;

public class Task2Logic
{
    private final static int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getDays(int month, int year) throws Exception
    {
        if (month > 12 || month < 1 || year < 0)
        {
            throw new Exception("Wrong parameters...");
        }

        int result = DAYS[month-1];

        if ((year % 100 != 0 || year % 400 == 0) && year % 4 == 0 && month == 2)
        {
            ++result;
        }

        return result;
    }
}
