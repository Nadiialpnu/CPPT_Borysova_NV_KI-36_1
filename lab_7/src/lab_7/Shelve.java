package lab_7;


import java.util.ArrayList;

public class Shelve <T extends Pages>{
    /**
     * ArrayList as a container for objects
     */
    private ArrayList<T> arr;

    /**
     * Constructor for Shelve object
     */
    public Shelve(){
        arr = new ArrayList<T>();
    }

    /**
     * Method for finding min element from container
     * @return min element in array
     */
    public T findMin(){
        if (!arr.isEmpty())
        {
            T min = arr.get(0);
            for (int i=1; i< arr.size(); i++)
            {
                if ( arr.get(i).compareTo(min) < 0 )
                    min = arr.get(i);
            }
            return min;
        }
        return null;
    }

    /**
     * method for adding books to shelve
     * @param books as a element on shelve
     */
    public void addBooks(T books){
        arr.add(books);
        System.out.println("The element added: ");
        books.print();
    }

    /**
     * method for deleting books from shelve
     * @param i
     */
    public void deleteBooks(int i){
        arr.remove(i);
    }
}
