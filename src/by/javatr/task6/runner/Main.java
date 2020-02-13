package by.javatr.task6.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task6.util.Task6Logic;

public class Main
{
    public static void main(String[] args)
    {
        int n = DataScanner.enterIntFromConsole();
        System.out.println(Task6Logic.getHour(n));
        System.out.println(Task6Logic.getMinute(n));
        System.out.println(Task6Logic.getSeconds(n));
    }
}
