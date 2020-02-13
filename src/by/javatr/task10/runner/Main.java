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

        try
        {
            double[] arr = Task10Logic.getArray(a, b, h);
            System.out.println("Результат вычисления: ");
            Printer.printHeader();
            Printer.printValues(arr, a, b, h);
            Printer.printLine();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
