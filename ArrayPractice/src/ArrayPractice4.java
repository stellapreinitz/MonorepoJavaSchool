public class ArrayPractice4
{
    static void main(String[] args)
    {
        int gridSizeX = 5;
        int gridSizeY = 5;
        int[][] grid = new int[gridSizeX][gridSizeY];
        int gridSum = 0;
        int borderSum = 0;

        for (int indexX = 0; indexX < gridSizeX; indexX++)
        {
            for (int indexY = 0; indexY < gridSizeY; indexY++)
            {
                grid[indexX][indexY] = indexX + indexY;
                gridSum += grid[indexX][indexY];
                //gridSize-1 used because array index starts at 0, will always be 1 less than gridSize
                if (indexX == 0 || indexY == 0 || indexX == gridSizeX-1 || indexY == gridSizeY-1)
                {
                    borderSum += grid[indexX][indexY];
                }
            }
        }
        for (int indexX = 0; indexX < gridSizeX; indexX++)
        {
            for (int indexY = 0; indexY < gridSizeY; indexY++)
            {
                System.out.print(grid[indexX][indexY] + " ");
            }
            System.out.println();
        }
        System.out.println("\nGrid Sum: " + gridSum);
        System.out.println("Border Sum: " + borderSum);
    }
}