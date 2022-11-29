package lab_3;

import java.io.*;

public class TV {
    private Power power;
    private Channel channel;
    private Volume volume;
    private PrintWriter fout;
    public boolean pause;

    public static int count;
    /* Constructor
    * @throws FileNotFoundException
    */ 
    public TV() throws FileNotFoundException {
        power = new Power();
        channel = new Channel();
        volume = new Volume();
        pause = false;
        fout = new PrintWriter("TV.txt");
    }

    /* Constructor
    * @param name - назва 
    * @param volume - гучність 
    * @throws FileNotFoundException
    */ 
    public TV(String name, int volume) throws FileNotFoundException {
    	channel = new Channel(name);
        this.volume = new Volume(volume);
        power = new Power();
        pause = false;
        fout = new PrintWriter("TV.txt");
        if(volume < 50) {
        	count++;
        }
    }
    static void retCount() { 
        System.out.println(count); 
    } 
    /**
     * Method вмикає/вимикає живлення
     */
    public void turnPower() {
        boolean value = power.getPower() == true ? false : true;
        power.setPower(value);
        System.out.println(power.getPower() == true ? "Power on" : "Power off");
        fout.println(power.getPower() == true ? "Power on" : "Power off");
        fout.flush();
    }

    /**
     * Method збільшує гучність
     */
    public void increaseTVVolume() {
        int tvVolume = volume.getVolume();
        if(tvVolume < 100) {
            volume.setVolume(tvVolume++);
            System.out.println("Increase tv volume to: " + tvVolume);
            fout.println("Increase tv volume to: " + tvVolume);
            fout.flush();
        }
        else {
            System.out.println("Can't increase. Max volume!");
            fout.println("Can't increase. Max volume!");
            fout.flush();
        }

    }

    /**
     * Method зменшує гучність
     */
    public void decreaseTVVolume() {
        int tvVolume = volume.getVolume();
        if(tvVolume > 0) {
            volume.setVolume(tvVolume--);
            System.out.println("Decrease tv volume to: " + tvVolume);
            fout.println("Decrease tv volume to: " + tvVolume);
            fout.flush();
        }
        else {
            System.out.println("Can't decrease. Min volume!");
            fout.println("Can't decrease. Min volume!");
            fout.flush();
        }
    }

    
    /** 
     * @return гучність
     */
    public int getTVVolume() {
        return volume.getVolume();
    }

    
    /**
     * Method змінює гучність
     * @param audioVolume - гучність
     */
    public void setTVVolume(int tvVolume) {
        volume.setVolume(tvVolume);
        System.out.println("Set tv volume to: " + tvVolume);
        fout.println("Set tv volume to: " + tvVolume);
        fout.flush();
    }

    
    /**
    * Method змінює назву
    * @param  name назва
    */ 
    public void setChannelName(String name){
    	channel.setChannel(name);
        System.out.println("Change channel to: " + name);
        fout.println("Change channel to: " + name);
        fout.flush();
    }

    
    /** 
     * @return назву
     */
    public String getChannelName(){
        return channel.getChannel();
    }

    /**
    * Method, який відповідає за включення
    */ 
    public void play(){
        if(channel.getChannel() != "..." && power.getPower() == true) {
            pause = false;
            System.out.println("This channel shows: " + channel.getChannel());
            fout.println("This channel shows: " + channel.getChannel());
            fout.flush();
        }
        else if(channel.getChannel() == "..." && power.getPower() == true) {
            System.out.println("Channel isn't loaded");
            fout.println("Channel isn't loaded");
            fout.flush();
        }
        else {
            System.out.println("Power is off. Turn on power");
            fout.println("Power is off. Turn on power");
            fout.flush();
        }

    }
    /**
    * Method, який відповідає за паузу
    */ 
    public void stop(){
        if(power.getPower() == true && channel.getChannel() != "...") {
            pause = true;
            System.out.println("Pause");
            fout.println("Pause");
            fout.flush();
        }
        else if(channel.getChannel() == "..." && power.getPower() == true) {
            System.out.println("Channel isn't loaded");
            fout.println("Channelisn't loaded");
            fout.flush();
        }
        else {
            System.out.println("Power is off. Turn on power");
            fout.println("Power is off. Turn on power");
            fout.flush();
        }
    }

    /**
    * Method releases used recourses
    */
    public void dispose() {
        fout.close();
    }
}

class Power {
    private boolean power;

    /* 
    *Constructor
    */ 
    public Power() {
        power = true;
    }

    /**
    * Method sets power
    * */
    public void setPower(boolean power){
        this.power = power;
    }

    /** 
     * @return power
     */
    public boolean getPower(){
        return power;
    }
}

class Channel {
    private String channelName;
    
    /* 
    * Constructor
    */ 
    public Channel() {
    	channelName = "...";
    }

    /* Constructor
    * @param name - назва
    */ 
    public Channel(String name) {
    	channelName = name;
    }

    /**
    * Method sets track
    * */
    public void setChannel(String name) {
    	channelName = name;
    }

    /** 
     * @return song
     */
    public String getChannel() {
        return channelName;
    }
}

class Volume {
	private static int maxVolume;
    private int volume;

    /* 
    * Constructor
    */ 
    public Volume() {
        volume = 100;
    }

    /* Constructor
    * @param volume - гучність
    */ 
    public Volume(int volume) {
    	++maxVolume;
        this.volume = volume;
       
    }

    /** 
     * @return volume
     */
    public int getVolume() {
        return volume;
    }

    /**
    * Method sets volume
    * */
    public void setVolume(int volume) {
        this.volume = volume;

       
    } 
}