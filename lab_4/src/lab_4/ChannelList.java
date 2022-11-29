package lab_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class ChannelList {

    private String[] NumbChannels;

    Scanner sc;
    File file;

    /**
     * Constructor
     * @param count
     */
    public ChannelList(int count)
    {
        /*try {
            NumbChannels = new String[count];
            file = new File("ChanList.txt");
            sc = new Scanner(file);
            for(int i = 0; i < count; i++){
                NumbChannels[i] = sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

    }

    /**
     * Constructor
     */
    public ChannelList(){
        {
           /* try {
                NumbChannels = new String[20];
                file = new File("src/ChanList.txt");
                sc = new Scanner(file);
                for(int i = 0; i < 20; i++){
                    NumbChannels[i] = sc.nextLine();
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            finally {
                sc.close();
            }*/
        }
    }

    /**
     * getter for channel numbers
     * @param id
     * @return
     */
    public String getChannel(int id){
        return NumbChannels[id];
    }

    /**
     * getter for channel length
     * @return
     */
    public int CountChannels(){
        return NumbChannels.length;
    }

    /**
     * setter for channels in channel list
     * @param name
     * @param id
     */
    public void setChannel(String name, int id){
        this.NumbChannels[id] = NumbChannels[id];
    }

    public void ClearChannList(){
        this.NumbChannels = null;
    }
}

