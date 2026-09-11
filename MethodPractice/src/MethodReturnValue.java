public class MethodReturnValue
{
    static void main(String[] args)
    {
        int roomWidth = 10;
        int roomHeight = 15;

        int roomArea = calculateRectangleArea(roomWidth, roomHeight);
        System.out.println(roomArea);
    }
    public static int calculateRectangleArea(int width, int height)
    {
        return width * height;
    }
}