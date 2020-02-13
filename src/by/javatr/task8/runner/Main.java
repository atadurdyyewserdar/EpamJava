package by.javatr.task8.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task8.util.Task8Logic;

public class Main
{
    public static void main(String[] args)
    {
        int t = DataScanner.enterIntFromConsole();
        System.out.println(Task8Logic.mathematicalFunction(t));
    }
}
