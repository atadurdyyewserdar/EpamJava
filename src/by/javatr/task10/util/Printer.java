package by.javatr.task10.util;

public class Printer
{
    public static void printHeader()
    {
        System.out.println("-----------------------------------------------");
        System.out.println("|          i           |        f(x)          |");
        System.out.println("-----------------------------------------------");
    }

    public static void printLine(){
        System.out.println("-----------------------------------------------\n");
    }

    public static void printValues(double[] array, double a, double b, double h)
    {
        int k = 0;

        for (double i = a; i < b; i += h)
        {
            System.out.printf("|%20f  |%20f  |\n", i, array[k++]);
        }
    }
}
