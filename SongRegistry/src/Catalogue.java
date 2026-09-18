import java.util.ArrayList;

public class Catalogue
{
    ArrayList<Song> catalogue = new ArrayList<>();
    public Catalogue()
    {
        catalogue.add (new Song("Bury It", "Chvrches", 188));
        catalogue.add (new Song("Homecoming","Green Day", 558));
        catalogue.add (new Song("Time Machine", "Robyn", 214));
        catalogue.add (new Song("Primadonna", "MARINA", 218));
    }
    public ArrayList<Song> getAllSongs()
    {
        return catalogue;
    }
}