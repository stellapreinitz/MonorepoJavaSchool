public class Song
{
    private String title;
    private String artist;
    private int durationSeconds;
    private MusicGenre genre;

    public Song(String title, String artist, MusicGenre genre, int durationSeconds)
    {
        setTitle(title);
        setArtist(artist);
        setDurationSeconds(durationSeconds);
        setGenre(genre);
    }
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public void setTitle(String title)
    {
        if (title == null || title.isBlank())
        {
            throw new IllegalArgumentException("Title must be given!");
        }
        this.title = title;
    }
    public void setArtist(String artist)
    {
        if (artist == null || artist.isBlank())
        {
            throw new IllegalArgumentException("Artist must be given!");
        }
        this.artist = artist;
    }
    public void setDurationSeconds(int durationSeconds)
    {
        if (durationSeconds <= 0)
        {
            throw new IllegalArgumentException("Duration must be larger than 0!");
        }
        this.durationSeconds = durationSeconds;
    }
    public void setGenre(MusicGenre genre)
    {
        if (genre == null)
        {
            throw new IllegalArgumentException("Genre must be given!");
        }
        this.genre = genre;
    }
    public int getDurationSeconds()
    {
        return durationSeconds;
    }
    public boolean isLong()
    {
        return durationSeconds >= 240;
    }
    @Override
    public String toString()
    {
        return title + ", " + artist + " Genre: " + genre + ", Length: " + durationSeconds;
    }
}