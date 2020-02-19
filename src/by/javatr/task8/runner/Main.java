package by.javatr.task8.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task8.util.Task8Logic;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Введите число x: ");
        double x = DataScanner.enterDoubleFromConsole();
        double result = Task8Logic.mathematicalFunction(x);
        System.out.println("Результат вычисления: " + result);
    }
}
