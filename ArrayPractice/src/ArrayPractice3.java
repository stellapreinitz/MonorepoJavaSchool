import java.util.Scanner;

public class ArrayPractice3
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[][] grid = new int [4][5];
        int highestInt = Integer.MIN_VALUE;
        int lowestInt = Integer.MAX_VALUE;

        for (int indexRow = 0; indexRow < grid.length; indexRow++)
        {
            for (int indexColumn = 0; indexColumn < grid[indexRow].length; indexColumn++)
            {
                grid[indexRow][indexColumn] = indexRow + indexColumn;
                System.out.print(grid[indexRow][indexColumn] + " ");
                if (grid[indexRow][indexColumn] > highestInt)
                {
                    highestInt = grid[indexRow][indexColumn];
                }
                if (grid[indexRow][indexColumn] < lowestInt)
                {
                    lowestInt = grid[indexRow][indexColumn];
                }
            }
            System.out.println();
        }
        System.out.println("Highest value is: " + highestInt);
        System.out.println("Lowest value is: " + lowestInt);

        System.out.println("Search for value: ");
        int searchedValue = scanner.nextInt();
        boolean valueFound = false;

        for (int indexRow = 0; indexRow < grid.length; indexRow++)
        {
            for (int indexColumn = 0; indexColumn < grid[indexRow].length; indexColumn++)
            {
                if (searchedValue == grid[indexRow][indexColumn])
                {
                    System.out.println("Value found at index " + (indexRow + 1) + " " + (indexColumn +1));
                    valueFound = true;
                }
            }
        }
        if (!valueFound)
        {
            System.out.println("Value not found.");
        }
        int[] rowSum = new int[4];
        for (int indexRow = 0; indexRow < grid.length; indexRow++)
        {
            rowSum[indexRow] = 0;
            for (int indexColumn = 0; indexColumn < grid[indexRow].length; indexColumn++)
            {
                rowSum[indexRow] += grid[indexRow][indexColumn];
            }
            System.out.println("The sum of row " + (indexRow + 1) + " is " +rowSum[indexRow]);
        }
    }
}