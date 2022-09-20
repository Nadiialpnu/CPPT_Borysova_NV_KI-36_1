package LAB_03;

import static java.lang.System.out;
import java.io.*;
public class TVApp {
	public static void main(String[] args)  throws FileNotFoundException {

        TV object = new TV("ASUS", 24, "LED", "1920 x 1080", 144, 100, "16:9");

        object.off_onTV(Status.ON);
        object.getSettings();
        object.brightDisplayPlus(25);
        object.brightDisplayMinus(63);

        object.changeMatrix("IPS");
        object.changeHz(75);
        object.changeResolution("1080x720");
        object.changeMonitorFormat("4:3");
        object.getSettings();

        object.off_onTV(Status.OFF);
        object.dispose();
    }
}
