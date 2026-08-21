public abstract class MediaItem extends Item{
    // field variables
    private int runTime;
    // constructors
    public MediaItem(){
        super();
        runTime = 0;
    }
    public MediaItem(int iID, String iTitle, int iNumCopies, int iRunTime){
        super(iID, iTitle, iNumCopies);
        runTime = iRunTime > 0? iRunTime: 0;
    }
    // Getters
    public int getRunTime(){ return runTime; }
    // Setters
    public void setRunTime(int iRunTime){ runTime = iRunTime> 0? iRunTime: 0; }
    public void setMediaItem(int iID, String iTitle, int iNumCopies, int iRunTime){
        setItem(iID, iTitle, iNumCopies);
        setRunTime(iRunTime);
    }
    public String toString(){
        return super.toString() + "\n" + "RUNTIME: " + runTime;
    }
    public boolean equals(Object other){ 
        if(!(other instanceof MediaItem))
            return false;
        MediaItem o1 = (MediaItem) other;
        return super.equals(o1) && runTime == o1.runTime;
    }
}
