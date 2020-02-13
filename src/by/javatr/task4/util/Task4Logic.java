package by.javatr.task4.util;

public class Task4Logic
{
    public static boolean ifExistsTwoEven(int... numbers)
    {
        int k = 0;
        for (int a : numbers)
        {
            if (a % 2 == 0)
            {
                k++;
            }
        }
        return k > 1;
    }
}
