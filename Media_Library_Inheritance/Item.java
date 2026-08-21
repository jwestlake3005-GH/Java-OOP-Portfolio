public abstract class Item {
    // field variables
    private int id;
    private String title;
    private int numCopies;
    // constructors
    public Item(){
        id = 0;
        title = "";
        numCopies = 0;
    }
    public Item(int iID, String iTitle, int iNumCopies){
        id = iID > 0? iID: 0;
        title = iTitle;
        numCopies = iNumCopies > 0? iNumCopies: 0;
    }
    // Getters 
    public int getID(){ return id; }
    public String getTitle(){ return title; }
    public int getNumCopies() { return numCopies; }
    // Setters
    public void setID(int iID) {
        id = iID > 0? iID: 0;
    }
    public void setTitle(String iTitle){
        title = iTitle;
    }
    public void setNumCopies(int iNumCopies){
        numCopies = iNumCopies> 0? iNumCopies: 0;
    }
    public void setItem(int iID, String iTitle, int iNumCopies){
        id = iID > 0? iID: 0;
        title = iTitle;
        numCopies = iNumCopies> 0? iNumCopies: 0;
    }
    // toString and equals
    public String toString(){
        return "ID: " + id + "\n" + "TITLE: " + title + "\n" + "NUMBER OF COPIES: " + numCopies;
    }
    public boolean equals(Object other){
        if(other == null || getClass() != other.getClass())
        return false;
        Item o1 = (Item) other;
        return id == o1.id &&
            title.equals(o1.title) &&
            numCopies == o1.numCopies;
    }
    public void checkOut(){
        if(numCopies > 0){
            numCopies -= 1;
        }
        else
            System.out.println("No Items available");
    }
    public void checkIn(){
        numCopies += 1;
    }
    public void addItem(){
        numCopies += 1;
    }
    public void print(){
        System.out.println(toString());
    }
}
