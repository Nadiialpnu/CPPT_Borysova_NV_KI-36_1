package lab_7;

public class Magazines implements Pages{
    /**
     * count of pages
     */
    private int mPages;
    /**
     * name of magazine
     */
    private String mName;

    /**
     * Constructor for Magazines
     * @param mName
     * @param mPages
     */
    public static int numm;
    public Magazines( String mName, int mPages){
        this.mPages = mPages;
        this.mName = mName;
        numm++;
    }

    /**
     * method for getting count of pages
     * @return
     */
    @Override
    public int getCount() {
        return mPages;
    }

    /**
     * setter of pages
     * @param mPages
     */
    public void setmPages(int mPages) {
        this.mPages = mPages;
    }

    /**
     * Getter for name of the magazine
     * @return
     */
    public String getmName() {
        return mName;
    }

    /**
     * Setter for name
     * @param mName
     */
    public void setmName(String mName) {
        this.mName = mName;
    }

    /**
     * Override method for printing information
     */
    @Override
    public void print(){
        System.out.println("Magazine:" + mName + "\tPages:" + mPages + "\n");
    }

    /**
     * Override method compareTo() for Books object that compares count of pages
     * @param p the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Pages p) {
        Integer s = mPages;
        return s.compareTo(p.getCount());
    }
}

