public class Catalogue
{
    Song[] catalogue;
    public Catalogue()
    {
        catalogue = new Song[10];
        catalogue[0] = new Song("Bury It", "Chvrches", 188);
        catalogue[1] = new Song("Homecoming","Green Day", 558);
    }
    public Song[] getAllSongs()
    {
        return catalogue;
    }
}