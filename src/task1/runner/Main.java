package task1.runner;

import scanner.DataScanner;
import task1.util.Function;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Main
{
    public static void main(String[] args)
    {

        //Task 1
        int number;
        number = DataScanner.enterIntFromConsole();
        int result = Function.getLastNumber(number);
        System.out.println(result);

        //Task 2
        int month, year;
        month = DataScanner.enterIntFromConsole();
        year = DataScanner.enterIntFromConsole();
        int result2 = Function.getDays(month, year);
        System.out.println(result2);

        //Task 3

        //Task 4
        int a, b, c, d;
        a = DataScanner.enterIntFromConsole();
        b = DataScanner.enterIntFromConsole();
        c = DataScanner.enterIntFromConsole();
        d = DataScanner.enterIntFromConsole();
        System.out.println(Function.ifExistsTwoEven(a, b, c, d));

        //Task 5
        int num = DataScanner.enterIntFromConsole();
        System.out.println(Function.perfectNumber(num));

        //Task 6
        int n = DataScanner.enterIntFromConsole();
        System.out.println(Function.getHour(n));
        System.out.println(Function.getMinute(n));
        System.out.println(Function.getSeconds(n));


        //Task 7
        int x1, x2, y1, y2;
        x1 = DataScanner.enterIntFromConsole();
        y1 = DataScanner.enterIntFromConsole();
        x2 = DataScanner.enterIntFromConsole();
        y2 = DataScanner.enterIntFromConsole();
        System.out.println(Function.findClosest(x1, y1, x2, y2));


        //Task 8
        int t = DataScanner.enterIntFromConsole();
        System.out.println(Function.mathematicalFunction(t));

        //Task 9
        double R = DataScanner.enterDoubleFromConsole();
        System.out.println(Function.getLength(R));
        System.out.println(Function.getSquare(R));


        //Task 10
        double aa, bb;
        int h;

        aa = DataScanner.enterDoubleFromConsole();
        bb = DataScanner.enterDoubleFromConsole();
        h = DataScanner.enterIntFromConsole();

        System.out.println("-----------------------------------------------");
        System.out.println("|          i           |        f(x)          |");
        System.out.println("-----------------------------------------------");

        for (double i = aa; i < bb; i += h)
        {
            System.out.printf("|%20f  |%20f  |\n", i, Math.tan(i));
        }

        System.out.println("-----------------------------------------------");
    }
}