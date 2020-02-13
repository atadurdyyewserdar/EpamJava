package by.javatr.task6.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task6.util.Task6Logic;

public class Main
{
    public static void main(String[] args)
    {
        int n = DataScanner.enterIntFromConsole();
        try
        {
            int hours, minutes, seconds;

            hours = Task6Logic.getHour(n);
            minutes = Task6Logic.getMinute(n);
            seconds = Task6Logic.getSeconds(n);

            System.out.println(hours);
            System.out.println(minutes);
            System.out.println(seconds);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
