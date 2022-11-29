package lab_7;

public class Lab7 {
    /**
     * main method of Lab7
     * @param args
     */
    public static void main(String[] args)
    {
        Shelve <? super Pages> shelve = new Shelve <Pages>();
        shelve.addBooks(new Books("Harry Potter" , 200, "J. K. Rowling"));
        shelve.addBooks(new Magazines("India Today" , 22));
        shelve.addBooks(new Books("To Kill a Mockingbird" , 365, "Harper Lee"));
        shelve.addBooks(new Books("The Death of the Heart" , 1332, "Elizabeth Bowen"));
        shelve.addBooks(new Magazines("Vogue" , 15));
        shelve.addBooks(new Magazines("TIME" , 35));
//        Pages res = shelve.findMin();
//        System.out.print("The minimum pages of Book/Magazine on shelve is: \n");
////        System.out.println(res.getCount());
//        res.print();
        System.out.println("Books: " + Books.numb);
        System.out.println("Magazines: " + Magazines.numm);
    }
}
