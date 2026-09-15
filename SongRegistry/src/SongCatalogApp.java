import java.util.Scanner;

public class SongCatalogApp
{
    private Scanner scanner;

    public SongCatalogApp()
    {
        this.scanner = new Scanner(System.in);
    }
    public void startProgram()
    {
        ConsoleUI.printHeader();
        ConsoleUI.presentMenu();
    }

    public static void main(String[] args)
    {
        SongCatalogApp myApp = new SongCatalogApp();
        myApp.startProgram();
    }
}