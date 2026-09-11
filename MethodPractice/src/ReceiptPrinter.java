public class ReceiptPrinter
{
    static void main(String[] args)
    {
        int productPrice = 349;
        int productQuantity = 33;
        String productName = "Mecha fighter 26";

        String storeName = getStoreName();
        printReceiptHeader(storeName);
        printDivider();
        int priceTotal = calculateTotal(productPrice, productQuantity);
        printLineItem(productName, priceTotal);
    }
    public static void printReceiptHeader(String header)
    {
        System.out.println(header);
    }
    public static void printDivider()
    {
        System.out.println("********************");
    }
    public static int calculateTotal(int pricePerItem, int quantity)
    {
        return pricePerItem * quantity;
    }
    public static void printLineItem(String itemName, int total)
    {
        System.out.println(itemName + ": " + total);
    }
    public static String getStoreName()
    {
        return "Astral Jellyfish";
    }
}