package lab_4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public abstract class TV {
    /**
     * Channel list field
     */

    ChannelList cl;
    /**
     * Remote controller field
     */
    RemController rc;
    /**
     * File for writing settings
     **/

    PrintWriter pw;

    {
        try {
            pw = new PrintWriter("src/Settings");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Constructor for TV
     */
    public TV(){
    }
    /**
     * Constructor for TV
     * @param cl for TV object
     */
    public TV(ChannelList cl){
        this.cl = cl;
    }
    /**
     * Constructor for Printer
     * @param cl for TV object
     * @param rc for TV object
     */
    public TV(ChannelList cl, RemController rc){
        this.cl = cl;
        this.rc = rc;
    }

    /**
     * Method for changing channels in channel list
     * @param number
     */
    public void setChannelPos(int number){
       // pw.println("Channel:\t" + number+ ")" + cl.getChannel(number));
    }

    /**
     * Method for changing volume
     * @param vol
     */
    public void setVol(int vol){
        rc.setVolume(vol);
        pw.println("Volume:\t\t" + vol);
    }
    /**
     * Method for changing contrast
     * @param con
     */
    public void setContr(int con){
        rc.setContrast(con);
        pw.println("Contrast:\t" + con);
    }
    /**
     * Method for changing brightness
     * @param br
     */
    public void setBright(int br){
        rc.setBrightness(br);
        pw.println("Brightness:\t" + br);
    }
    /**
     * Method for changing saturation
     * @param sat
     */
    public void setSatur(int sat){
        rc.setSaturation(sat);
        pw.println("Saturation:\t" + sat);
    }
    /**
     * getter for channel list
     */
    public void getChannelList(){
        for (int i = 0; i < cl.CountChannels(); i++) {
            System.out.println(cl.getChannel(i));
        }
    }

    /**
     * Method for closing file
     */
    public void closeFile(){
        pw.close();
    }

    /**
     * /**
     * Method for writing data to file
     * @param type
     * @param name
     */
    public void fileWriter(String type, String name){
        pw.println(type + ": " + name);
    }
}

