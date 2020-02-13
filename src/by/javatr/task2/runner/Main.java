package by.javatr.task2.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task2.util.Task2Logic;


public class Main
{
    public static void main(String[] args)
    {
        int month, year;
        System.out.print("Введите месяц: ");
        month = DataScanner.enterIntFromConsole();
        System.out.print("Введите год: ");
        year = DataScanner.enterIntFromConsole();
        int result2 = 0;
        try
        {
            result2 = Task2Logic.getDays(month, year);
            System.out.print("Результат вычисления: " + result2);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
