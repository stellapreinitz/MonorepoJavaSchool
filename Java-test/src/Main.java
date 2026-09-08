import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many days you want to register temperature for: ");
        int numberOfDays = scanner.nextInt();
        int[] temperature = new int[numberOfDays];

        System.out.println("The array has " + temperature.length + " indexes.");

        for (int index = 0; index < temperature.length; index++)
        {
            System.out.println("Enter temperature for day " + (index + 1) + ":");
            temperature[index] = scanner.nextInt();
        }
        for (int index = 0; index < temperature.length; index++)
        {
            System.out.println("Temperature for day " + (index + 1) + " is " + temperature[index] + ".");
        }
    }
}