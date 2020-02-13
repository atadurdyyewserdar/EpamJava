package by.javatr.task5.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task5.util.Task5Logic;

public class Main
{
    public static void main(String[] args)
    {
        int num = DataScanner.enterIntFromConsole();
        System.out.println(Task5Logic.perfectNumber(num));
    }
}