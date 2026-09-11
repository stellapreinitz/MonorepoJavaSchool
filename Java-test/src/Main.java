import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        int[] scores = {72, 88, 94, 61, 79};

        printNumbers(scores);
        int sum = calculateSum(scores);

        System.out.println("\nSum: " + sum);
    }
    public static void printNumbers(int[] values)
    {
        System.out.println("---Scores---");
        for (int index=0; index < values.length; index++)
            System.out.println(("Score ") + (index+1) + ": " + values[index]);
    }
    public static int calculateSum(int[] values)
    {
        int sum = 0;
        for (int index=0; index < values.length; index++)
        {
            sum += values[index];
        }
        return sum;
    }
}