public class ArrayPractice4
{
    static void main(String[] args)
    {
        int[][] grid = new int[5][5];
        int gridSum = 0;
        int borderSum = 0;

        for (int indexX = 0; indexX < 5; indexX++)
        {
            for (int indexY = 0; indexY < 5; indexY++)
            {
                grid[indexX][indexY] = indexX + indexY;
                gridSum += grid[indexX][indexY];
                if (indexX == 0 || indexY == 0 || indexX == (grid.length - 1) || indexY == (grid.length - 1))
                {
                    borderSum += grid[indexX][indexY];
                }
            }
        }
        for (int indexX = 0; indexX < 5; indexX++)
        {
            for (int indexY = 0; indexY < 5; indexY++)
            {
                System.out.print(grid[indexX][indexY] + " ");
            }
            System.out.println();
        }
        System.out.println("\nGrid Sum: " + gridSum);
        System.out.println("Border Sum: " + borderSum);
    }
}