package lab_4;

public interface Tuner {
    /**
     * Method for searching TV programs
     * @param name
     */
    void TVPrograms(String name);
    /**
     * Method for searching Radio stations
     * @param nameOfStation
     */
    void FMRadio(String nameOfStation);
    
    /**
     * Method for searching movies
     * @param nameOfMovie
     */
    void MoviePlayer(String nameOfMovie);
}
