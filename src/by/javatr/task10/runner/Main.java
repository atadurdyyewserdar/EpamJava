package by.javatr.task10.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task10.util.Printer;
import by.javatr.task10.util.Task10Logic;

public class Main
{
    public static void main(String[] args)
    {
        double a, b, h;

        a = DataScanner.enterDoubleFromConsole();
        b = DataScanner.enterDoubleFromConsole();
        h = DataScanner.enterDoubleFromConsole();

        double[] arr = Task10Logic.getArray(a, b, h);

        Printer.printHeader();
        Printer.printValues(arr, a, b, h);
        Printer.printLine();
    }
}
