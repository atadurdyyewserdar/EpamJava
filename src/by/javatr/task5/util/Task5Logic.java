package by.javatr.task5.util;

public class Task5Logic
{
    public static boolean perfectNumber(int number)
    {
        if (number < 2)
        {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                sum += i;
            }
        }
        return sum == number;
    }
}
