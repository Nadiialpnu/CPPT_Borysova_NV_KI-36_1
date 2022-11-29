package lab_7;

public class Books implements Pages{
    /**
     * book name field
     */
    private String BookName;
    /**
     * book page field
     */
    private int BookPages;
    /**
     * author name field
     */
    private String authorName;

    /**
     * Constructor for Books
     * @param bName
     * @param bPages
     * @param authName
     */
    public static int numb;
    public Books(String bName, int bPages, String authName ){
        this.BookName = bName;
        this.BookPages = bPages;
        this.authorName = authName;
        numb++;
    }

    /**
     * method for getting count of pages
     * @return
     */
    public int getCount(){
        return BookPages;
    }

    /**
     * getter for author name
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * setter for Author name
     * @param authorName
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * getter for Book name
     * @return
     */
    public String getBookName() {
        return BookName;
    }

    /**
     * Setter for book name
     * @param bookName
     */
    public void setBookName(String bookName) {
        BookName = bookName;
    }

    /**
     * Override method for printing information
     */
    public void print(){
        System.out.println("Book:" + BookName + "\tPages:" + BookPages + "\tThe author:" + authorName + "\n");
    }

    /**
     * Override method compareTo() for Magazines object that compares count of pages
     * @param p the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Pages p) {
        Integer b = BookPages;
        return b.compareTo(p.getCount());
    }
}
