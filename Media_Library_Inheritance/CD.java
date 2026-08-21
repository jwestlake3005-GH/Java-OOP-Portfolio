public class CD extends MediaItem{
    // field variables
    private String artist;
    private String genre;
    // Constructors
    public CD(){
        super();
        artist = "";
        genre = "";
    }
    public CD(int iID, String iTitle, int iNumCopies, int iRunTime, String iArtist, String iGenre){
        super(iID, iTitle, iNumCopies, iRunTime);
        artist = iArtist;
        genre = iGenre;
    }
    // Getters
    public String getArtist(){ return artist; }
    public String getGenre(){ return genre; }
    // Setters
    public void setArtist(String iArtist){
        artist = iArtist;
    }
    public void setGenre(String iGenre){ 
        genre = iGenre;
    }
    public void setCD(int iID, String iTitle, int iNumCopies, int iRunTime, String iArtist, String iGenre){
        setMediaItem(iID, iTitle, iNumCopies, iRunTime);
        setArtist(iArtist);
        setGenre(iGenre);
    }
    // toString and equals 
    public String toString(){
        return super.toString() + "\n" + "ARTIST: " + artist + "\n" + "GENRE: " + genre;
    }
    public boolean equals(Object other){
        if(!(other instanceof CD))
            return false;
        CD o1 = (CD) other;
        return super.equals(o1) && artist.equals(o1.artist) && genre.equals(o1.genre);
    }
}
