/*
This program creates RainFall class with constructor and methods that calculate
total, average, month with most rainfall, and month with least rainfall.
 */
package homework3project5;

public class RainFall
{
    // Declare array variables
    private double[] monthlyRainfall = new double[12];
    
    // Declare and initialize array variable for monthName
    String[] monthName = {"January", "February", "March", "April", "May", 
                          "June", "July", "August", "September", "October", 
                          "November", "December"};
    
    // RainFall constructor that accept monthly rainfall
    public RainFall(double[] rainfallAmountPerMonth)
    {
        monthlyRainfall = rainfallAmountPerMonth;
    }

    // Method that calculate total rainfall and return the value
    public double getYearlyTotalRainfall()
    {
        double totalRainfall = 0;

        // For loop to iterate through the 12 months to calcuate total rainfall
        for(int index = 0; index < monthlyRainfall.length; index++)
        {
            totalRainfall = totalRainfall + monthlyRainfall[index];
        }
        return totalRainfall;
    }
    
    // Method to calculate average rainfall and return the average rainfall
    public double getAverageMonthlyRainfall()
    {
        double averageRainfall;
        
        // Calculate average rainfall
        averageRainfall = getYearlyTotalRainfall()/monthlyRainfall.length;
        return averageRainfall;
    }

    // Method to get the month with most rainfall and return the month name
    public String getMostRainfallMonth()
    {
        String nameMostRainMonth = monthName[0];
        double mostRainfall = monthlyRainfall[0];     
        
        // For loop to get the month with most rain and store it in mostRainfall
        for(int index = 0; index < monthlyRainfall.length; index++)
        {
            if(monthlyRainfall[index] > mostRainfall)
            {
                mostRainfall = monthlyRainfall[index];
                nameMostRainMonth = monthName[index];
            }
        }  
        return nameMostRainMonth;
    }
    
    // Method to get the month with least rainfall and return the month name
    public String getLeastRainfallMonth()
    {
        String nameLeastRainMonth = monthName[0];
        double leastRainfall = monthlyRainfall[0];
        
        // For loop to get the month with most rain and store it in leastRainfall
        for(int index = 0; index < monthlyRainfall.length; index++)
        {
            if(monthlyRainfall[index] < leastRainfall)
            {
                leastRainfall = monthlyRainfall[index];
                nameLeastRainMonth = monthName[index];
            }
        }        
        return nameLeastRainMonth;
    }      
}
