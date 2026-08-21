public class Video extends MediaItem{
    // Field variables
    private String director;
    private String genre;
    private int yearReleased;
    // Constructors
    public Video(){
        super();
        director = "";
        genre = "";
        yearReleased = 0;
    }
    public Video(int iID, String iTitle, int iNumCopies, int iRunTime, String iDirector, String iGenre, int iYearReleased){
        super(iID, iTitle, iNumCopies, iRunTime);
        director = iDirector;
        genre = iGenre;
        yearReleased = iYearReleased > 0? iYearReleased: 0;
    }
    // Getters
    public String getDirector(){ return director; }
    public String getGenre(){ return genre; }
    public int getYearReleased(){ return yearReleased; }
    // Setters
    public void setDirector(String iDirector){ director = iDirector; }
    public void setGenre(String iGenre){ genre = iGenre; }
    public void setYearReleased(int iYearReleased){ yearReleased = iYearReleased > 0? iYearReleased: 0; }
    public void setVideo(int iID, String iTitle, int iNumCopies, int iRunTime, String iDirector, String iGenre, int iYearReleased){
        super.setMediaItem(iID, iTitle, iNumCopies, iRunTime);
        setDirector(iDirector);
        setGenre(iGenre);
        setYearReleased(iYearReleased);
    }
    // toString and equals
    public String toString(){
        return super.toString() + "\n" + "DIRECTOR: " + director + "\n" + "GENRE: " + genre + "\n" + "YEAR RELEASED: " + yearReleased;
    }
    public boolean equals(Object other){
        if(!(other instanceof Video))
            return false;
        Video o1 = (Video) other;
        return super.equals(o1) && director.equals(o1.director) && genre.equals(o1.genre) && yearReleased == o1.yearReleased;
    }
}
