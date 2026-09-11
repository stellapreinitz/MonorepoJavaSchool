public class SumPrintArray
{
    static void main(String[] args)
    {
        int[] numbersArray = {4, 7, 8, 9, 10, 13, 15};

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
}
