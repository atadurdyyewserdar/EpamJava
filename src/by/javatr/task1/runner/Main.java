package by.javatr.task1.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task1.util.Task1Logic;

public class Main
{
    public static void main(String[] args)
    {
        int number;
        number = DataScanner.enterIntFromConsole();
        int result = Task1Logic.getLastNumber(number);
        System.out.println(result);
    }
}