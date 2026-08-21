public abstract class WrittenItem extends Item{
    // field variables
    private String author;
    // Constructors
    public WrittenItem(){
        super();
        author = "";
    }
    public WrittenItem(int iID, String iTitle, int iNumCopies, String iAuthor){
        super(iID, iTitle, iNumCopies);
        author = iAuthor;
    }
    // Getters
    public String getAuthor(){ return author; }
    //Setters
    public void setAuthor(String iAuthor){
        author = iAuthor;
    }
    public void set(int iID, String iTitle, int iNumCopies, String iAuthor){
        setItem(iID, iTitle, iNumCopies);
        setAuthor(iAuthor);
    }
    public String toString(){
        return super.toString() + "\n" + "AUTHOR: " + author;
    }
    public boolean equals(Object other){
        if(!(other instanceof WrittenItem))
            return false;
        WrittenItem o1 = (WrittenItem) other;
        return super.equals(o1) && author.equals(o1.author);
    }
}
