public class SongCatalogueApp
{
    public void startProgram()
    {
        Catalogue catalogue = new Catalogue();
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.printHeader();

        int choice = 0;
        while (choice != 5)
        {
            choice = consoleUI.presentMenu();
            switch (choice)
            {
                case 1 -> consoleUI.displaySongs(catalogue.getAllSongs());
                case 2 -> consoleUI.displayLongSong(catalogue.getAllSongs());
            }
        }
    }
    public static void main(String[] args)
    {
        SongCatalogueApp myApp = new SongCatalogueApp();
        myApp.startProgram();
    }
}