package by.javatr.task5.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task10.util.Task10Logic;
import by.javatr.task5.util.Task5Logic;

public class Main
{
    public static void main(String[] args)
    {
        int num = DataScanner.enterIntFromConsole();
        boolean result = Task5Logic.isPerfectNumber(num);
        System.out.println(result);
    }
}