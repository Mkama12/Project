/*
This program asks a user to enter monthly rainfall for 12 months and uses the 
RainFall class to calculate the total and average rainfall. It displays the 
total, average, month with most rainfall, and month with least rainfall on the
console
 */
package homework3project5;

import java.util.Scanner;

public class Homework3Project5
{
    public static void main(String[] args)
    {
        double[] rainfall = new double[12]; //Declare rainfall array to hold user input
        
        getAmountRainfall(rainfall); //Call getAmountRainfall method

    }

    //Method to ask for user input and store them in the monthlyRain array
    public static void getAmountRainfall(double[] monthlyRain)
    {
        //Declare and initialize variable nameOfMonth that shows the month to 
        //take value for
        String[] nameOfMonth =
        {
            "January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October",
            "November", "December"
        };

        monthlyRain = new double[12]; //Hold the user input
        
        // Scanner object to get user input
        Scanner keyboard = new Scanner(System.in);

        // For loop to get the user input for the 12 months
        for (int index = 0; index < nameOfMonth.length; index++)
        {
            // Ask for user input and store it in minthlyRain
            System.out.println("Enter the amount of rainfall for " + nameOfMonth[index]);
            monthlyRain[index] = keyboard.nextDouble();
            
            // While loop to validate user input
            while(monthlyRain[index] < 0)
            {
                // Display error message and ask for user input again
                System.out.println("""
                               ERROR: The monthly rainfall should not be less 0
                               Try Again: Enter the amount of rainfall for  """ 
                               + " " + nameOfMonth[index]);
                monthlyRain[index] = keyboard.nextDouble();               
            }
        }  
        
        // Method call for displayResult
        displayResult(monthlyRain);
    }

    // Method that display result on console
    public static void displayResult(double[] monthlyRain)
    {
        RainFall rainFallAmount = new RainFall(monthlyRain);

        System.out.printf("""
                          Total Rainfall: %.2f
                          Average Rainfall: %.2f
                          Month with Most Rainfall: %S
                          Month with Least Rainfall:%S
                          """,
                          rainFallAmount.getYearlyTotalRainfall(),
                          rainFallAmount.getAverageMonthlyRainfall(),
                          rainFallAmount.getMostRainfallMonth(),
                          rainFallAmount.getLeastRainfallMonth());
    }
}
