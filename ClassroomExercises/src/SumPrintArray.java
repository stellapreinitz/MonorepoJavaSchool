import java.util.Scanner;

public class SumPrintArray
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int[] numbersArray = new int[setArraySize(scanner)];
        populateArray(numbersArray, scanner);
        printNumbers(numbersArray);
        int numbersSum = calculateSum(numbersArray);
        double numbersAverage = calculateAverage(numbersSum, numbersArray);

        System.out.println("\nSum: " + numbersSum);
        System.out.println("Average: " + numbersAverage);
    }
    public static void printNumbers(int[] values)
    {
        for (int index = 0; index < values.length; index++)
        {
            System.out.println("Number " + (index+1) + ": " + values[index]);
        }
    }
    public static int calculateSum(int[] values)
    {
        int sum = 0;
        for (int index = 0; index < values.length; index++)
        {
            sum += values[index];
        }
        return sum;
    }
    public static double calculateAverage(int sum, int[] values)
    {
        return (double)sum/values.length;
    }
    public static int setArraySize(Scanner scanner)
    {
        return scanner.nextInt();
    }
    public static void populateArray(int[] array, Scanner scanner)
    {
        for (int index = 0; index < array.length; index++)
        {
            System.out.println("Enter number " + (index+1));
            array[index] = scanner.nextInt();
        }
    }
}