package by.javatr.task7.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task7.util.Task7Logic;

public class Main
{
    public static void main(String[] args)
    {
        int x1, x2, y1, y2;
        System.out.println("Кординаты точек A(x1, y1): ");
        System.out.print("x1: ");
        x1 = DataScanner.enterIntFromConsole();
        System.out.print("y1: ");
        y1 = DataScanner.enterIntFromConsole();
        System.out.println("Кординаты точек B(x2, y2): ");
        System.out.print("x2: ");
        x2 = DataScanner.enterIntFromConsole();
        System.out.print("y2: ");
        y2 = DataScanner.enterIntFromConsole();
        String result = Task7Logic.findClosest(x1, y1, x2, y2);
        System.out.println("\nРезудьтат: " + result);
    }
}
