package lab_4;

public class RemController {
    private int volume;
    private int channelNumb;
    private int contrast = 50;
    private int saturation = 45;
    private int brightness = 70;

    /**
     * Constructor
     * @param volume
     * @param channelNumb
     */
    public RemController(int volume, int channelNumb) {
        this.volume = volume;
        this.channelNumb = channelNumb;
    }

    /**
     * getter of volume
     * @return
     */
    public int getVolume() {
        return volume;
    }

    /**
     * setter of volume
     * @param volume
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * getter for channel number
     * @return channel position number
     */
    public int getChannelNumb() {
        return channelNumb;
    }
    /**
     * setter of channel number
     * @param channelNumb
     */
    public void setChannelNumb(int channelNumb) {
        this.channelNumb = channelNumb;
    }
    /**
     * setter of contrast
     * @param contrast
     */
    public void setContrast(int contrast) {
        this.contrast = contrast;
    }
    /**
     * setter of saturation
     * @param saturation
     */
    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }
    /**
     * setter of Brightness
     * @param brightness
     */
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
