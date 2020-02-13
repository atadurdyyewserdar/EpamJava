package by.javatr.task7.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task7.util.Task7Logic;

public class Main
{
    public static void main(String[] args)
    {
        int x1, x2, y1, y2;
        x1 = DataScanner.enterIntFromConsole();
        y1 = DataScanner.enterIntFromConsole();
        x2 = DataScanner.enterIntFromConsole();
        y2 = DataScanner.enterIntFromConsole();
        System.out.println(Task7Logic.findClosest(x1, y1, x2, y2));
    }
}
