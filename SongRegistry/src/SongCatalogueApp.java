import java.util.Scanner;

public class SongCatalogueApp
{
    private Scanner scanner;

    public SongCatalogueApp()
    {
        this.scanner = new Scanner(System.in);
    }
    public void startProgram()
    {
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.printHeader();
        consoleUI.presentMenu(scanner);
    }

    public static void main(String[] args)
    {
        SongCatalogueApp myApp = new SongCatalogueApp();
        myApp.startProgram();
    }
}