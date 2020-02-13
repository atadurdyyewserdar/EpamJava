package by.javatr.task4.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task4.util.Task4Logic;

public class Main
{
    public static void main(String[] args)
    {
        int a, b, c, d;
        a = DataScanner.enterIntFromConsole();
        b = DataScanner.enterIntFromConsole();
        c = DataScanner.enterIntFromConsole();
        d = DataScanner.enterIntFromConsole();
        System.out.println(Task4Logic.ifExistsTwoEven(a, b, c, d));
    }
}
