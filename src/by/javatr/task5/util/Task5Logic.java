package by.javatr.task5.util;

public class Task5Logic
{
    public static boolean isPerfectNumber(int number)
    {
        boolean result = false;

        int sum = 0;

        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                sum += i;
            }
        }

        if (sum == number && number > 0)
        {
            result = true;
        }

        return result;
    }
}
