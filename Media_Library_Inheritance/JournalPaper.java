public class JournalPaper extends WrittenItem{
    private int yearPublished;
    // Constructors
    public JournalPaper(){
        super();
        yearPublished = 0;
    }
    public JournalPaper(int iID, String iTitle, int iNumCopies, String iAuthor, int iYearPublished){
        super(iID, iTitle, iNumCopies, iAuthor);
        yearPublished = iYearPublished > 0? iYearPublished: 0;
    }
    // Getters
    public int getYearPublished(){ return yearPublished; }
    // Setters
    public void setYearPublished(int iYearPublished){
        yearPublished= iYearPublished > 0? iYearPublished: 0;
    }
    public void setJournalPaper(int iID, String iTitle, int iNumCopies, String iAuthor, int iYearPublished){
        super.set(iID, iTitle, iNumCopies, iAuthor);
        setYearPublished(iYearPublished);
    }
    public String toString(){
        return super.toString() + "\n" + "YEAR PUBLISHED: " + yearPublished;
    }
    public boolean equals(Object other){
        if(!(other instanceof JournalPaper))
            return false;
        JournalPaper o1 = (JournalPaper) other;
        return super.equals(o1) && yearPublished == o1.yearPublished;
    }
}
