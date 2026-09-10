public class ArrayPractice5
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
        //Sums first row
        {
            int indexX = 0;
            for (int indexY = 0; indexY < gridSizeY; indexY++)
            {
                borderSum += grid[indexX][indexY];
            }
        }
        //Sums last row
        {
            int indexX = gridSizeX-1;
            for (int indexY = 0; indexY < gridSizeY; indexY++)
            {
                borderSum += grid[indexX][indexY];
            }
        }
        //Sums first column minus first and last indexes (corners already counted in row loops)
        {
            int indexY = 0;
            for (int indexX = 1; indexX < gridSizeX-1; indexX++)
            {
                borderSum += grid[indexX][indexY];
            }
        }
        //Sums last column minus first and last indexes (corners already counted in row loops)
        {
            int indexY = gridSizeY-1;
            for (int indexX = 1; indexX < gridSizeX-1; indexX++)
            {
                borderSum += grid[indexX][indexY];
            }
        }
        System.out.println("\nGrid Sum: " + gridSum);
        System.out.println("Border Sum: " + borderSum);
    }
}