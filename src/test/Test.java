package test;

import scanner.DataScanner;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        int x = 10;
        int b = 10;
        int j = --x + (b++);
        System.out.println(j);
        System.out.println(x);
        System.out.println(b);
    }
}