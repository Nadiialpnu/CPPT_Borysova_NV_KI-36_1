package lab_4;

public class Samsung extends TV implements Tuner, InterfaceA{

    /**
     * Constructor of class Samsung
     * @param cl
     */
    public Samsung(ChannelList cl) {
        super(cl);
    }
    /**
     * Constructor of class Samsung
     * @param cl
     * @param rc 
     */
    public Samsung(ChannelList cl, RemController rc) {
        super(cl, rc);
    }

    /**
     * Overrided method for searching TV Programs
     * @param name
     */
    @Override
    public void TVPrograms(String name){
        System.out.println("You are watching "+name+" now");
        fileWriter("Tuner TV program: ", name);
    }
    /**
     * Overrided method for searching Radio Stations
     * @param nameOfStation
     */
    @Override
    public void FMRadio(String nameOfStation){
        System.out.println("You are listening " + nameOfStation + " now");
        fileWriter("Tuner FM Radio: ", nameOfStation);

    }
    /**
     * Overrided method for searching movies
     * @param nameOfMovie
     */
    @Override
    public void MoviePlayer(String nameOfMovie){
        System.out.println("You are watching " +nameOfMovie+" now");
        fileWriter("Tuner Movie: ", nameOfMovie);
    }

}
