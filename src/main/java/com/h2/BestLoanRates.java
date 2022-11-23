package com.h2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


    /*

    Navigate to the line in the main() method where you printed "Hello " with the user name. Right after that,
    print another line using System.out.println() that says "Enter the loan term (in years)".
    Then, call the nextInt() method on scanner variable. Save the value received into a new variable called loanTermInYears.
    The type of this variable must be int since scanner.nextInt() returns an int.

    Then, call the getRates() method and pass loanTermInYears as the argument. Save the received value into a variable called bestRate.
    The variable must be of type float since getRates() returns a value of type float.




     */

public class BestLoanRates {

    public static final Map<Integer, Float> bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.println("Enter loan term (in years)");

        int loanTermInYears = scanner.nextInt();


        float bestRate = getRates(loanTermInYears);

        if (bestRate == 0.0f) {
            System.out.println("No available rates for term: " + loanTermInYears + " years");
        } else {
            System.out.println("Best Available Rate: " + bestRate + "%");
        }

        scanner.close();


        /*
        Now, if the value of bestRate is 0.0f, print "No available rates for term: " + loanTermInYears + " years" (using System.out.println()).
        Otherwise, print "Best Available Rate: " + getRates(loanTermInYears) + "%".
        Read more about the float comparisons in java at this Stack Overflow page on comparing floats.

        Finally, call the close() method on scanner.
         */



    }

    public static float getRates(int loanTermInYears){
        if (bestRates.containsKey(loanTermInYears)) {
            return bestRates.get(loanTermInYears);
        } return 0.0f;
    }
}



