package by.javatr.task3.util;

public class Task3Logic
{

    public static double getResult(double S) throws Exception
    {
        if (S < 1)
        {
            throw new Exception("Wrong argument...");
        }
        double R = Math.sqrt(S) / 2; // радиус окружности вписанного в квадрать
        double d = R * 2; // дигональ квадрата вписанного в окружност
        double a = Math.sqrt((d * d) / 2); // сторона квадрата квадрата вписанного в окружност
        return a * a; // площад квадрата вписанного в окружност
    }

    // Функци для определения во сколько раз число S1 больше или менше числа S2
    public static double getCompareResult(double S1, double S2) throws Exception
    {
        if (S1 < S2)
        {
            throw new Exception("Wrong a argument");
        }
        return S1 / S2;
    }
}