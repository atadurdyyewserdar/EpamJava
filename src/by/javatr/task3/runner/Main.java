package by.javatr.task3.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task3.util.Task3Logic;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Введите площадь квадрата: ");
        double S = DataScanner.enterDoubleFromConsole();
        try
        {
            double S2 = Task3Logic.getResult(S);
            System.out.println("Площадь квадрата вписанного в окружность: " + S2);
            double comp = Task3Logic.getCompareResult(S, S2);
            System.out.println("Квадрать вписанный в окружность " + comp + " раз менше заданного");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
