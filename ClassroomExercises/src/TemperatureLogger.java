import java.util.Scanner;

public class TemperatureLogger
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many temperatures do you want to register?");
        int numberOfDays = scanner.nextInt();
        int warmestTemperature = Integer.MIN_VALUE;
        int coldestTemperature = Integer.MAX_VALUE;

        while (numberOfDays <= 0)
        {
            System.out.println("Enter at lest 1 day to register.");
            System.out.println("How many temperatures do you want to register?");
            numberOfDays = scanner.nextInt();
        }
        int[] temperatures = new int[numberOfDays];

        for (int index = 0; index < temperatures.length; index++)
        {
            System.out.println("Enter temperature for day " + (index + 1 ) + ":");
            temperatures[index] = scanner.nextInt();
            if (temperatures[index] > warmestTemperature)
            {
                warmestTemperature = temperatures[index];
            }
            if (temperatures[index] < coldestTemperature)
            {
                coldestTemperature = temperatures[index];
            }
        }
        int sum = 0;
        System.out.println("\n---Registered temperatures---");
        for (int index = 0; index < temperatures.length; index++)
        {
            System.out.println("Day " + (index + 1) + ": " + temperatures[index] + " degrees.");
            sum += temperatures[index];
        }
        double temperatureAverage = (double) sum / temperatures.length;
        System.out.println("The average temperature for the period is: " + temperatureAverage + " degrees.");
        System.out.println("The warmest temperature was " + warmestTemperature + ".");
        System.out.println("The coldest temperature was " + coldestTemperature + ".");
    }
}