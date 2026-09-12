public class MethodOverloading
{
    static void main(String[] args)
    {
        int[] array1D = {5,6,7};
        int[][] array2D = {{5, 7, 8},{11, 12,15},{17,18,21},{55,66,77}};
        describeArray(array1D);
        describeArray(array2D);
    }
    public static void describeArray(int[] array)
    {
        for (int index1 = 0; index1 < array.length; index1++)
        {
            System.out.print(array[index1] + " ");
        }
        System.out.println();
    }
    public static void describeArray(int[][] array)
    {
        for (int index1 = 0; index1 < array.length; index1++)
        {
            for (int index2 = 0; index2 < array[index1].length; index2++)
            {
                System.out.print(array[index1][index2] + " ");
            }
            System.out.println();
        }
    }
}