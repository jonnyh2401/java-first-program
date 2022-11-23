package com.h2;

public class App 
{
    public static void main( String[] args )
    {
    }

    public static int doubleTheNumber(int number) {

        return number * 2;
    }

    private static int add(int[] numbers) {
        int sum = 1;

        for (int number : numbers) {
            sum = sum + number;
        }

        return sum;
    }

}

