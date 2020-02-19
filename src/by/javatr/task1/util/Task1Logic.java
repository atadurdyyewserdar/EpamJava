package by.javatr.task1.util;

public class Task1Logic
{
    public static int getLastNumber(int number)
    {
        int lastNumber = number % 10;
        return (int) Math.pow(lastNumber, 2) % 10;
    }
}