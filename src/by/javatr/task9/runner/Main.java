package by.javatr.task9.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task9.util.Task9Logic;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Радиус: ");
        double R = DataScanner.enterDoubleFromConsole();
        try
        {
            double length = Task9Logic.getLength(R);
            double square = Task9Logic.getSquare(R);
            System.out.println("Длина окружности: " + length);
            System.out.println("Площадь круга: " + square);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
