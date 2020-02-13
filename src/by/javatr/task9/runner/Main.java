package by.javatr.task9.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task9.util.Task9Logic;

public class Main
{
    public static void main(String[] args)
    {
        double R = DataScanner.enterDoubleFromConsole();
        System.out.println(Task9Logic.getLength(R));
        System.out.println(Task9Logic.getSquare(R));
    }
}
