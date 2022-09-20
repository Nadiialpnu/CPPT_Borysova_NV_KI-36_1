package LAB_03;
import java.io.*;
public class TV {
	 private double hz;
	    private String name;
	    private String resolution;
	    private double diagonal;
	    private String matrix;
	    private double BrightDisplay;
	    private Status status;
	    private PrintWriter myWrite;
	    private String TVFormat;

	    /**
	     * Constructor
	     * @throws FileNotFoundException param
	     */

	    public TV() throws FileNotFoundException {
	        matrix = "None";
	        diagonal = 0;
	        name = "None";
	        resolution = "None";
	        hz = 0;
	        BrightDisplay = 0;
	        TVFormat = "None";
	        myWrite = new PrintWriter("Log.txt");
	    }

	    /**
	     * Constructor
	     * @param name <code>name</code> Name of TV
	     * @param diagonal <code>diagonal</code> TV diagonal
	     * @param matrix <code>matrix</code> TV matrix
	     * @param resolution <code>resolution</code> TV resolution
	     * @param hz <code>hz</code> TV refresh rate
	     * @param BrightDisplay <code>BrightDisplay</code> The brightness of the TV display
	     * @param TVFormat <code>TVFormat</code> TV screen format
	     * @throws FileNotFoundException
	     */

	    public TV(String name, double diagonal, String matrix, String resolution, double hz, double BrightDisplay, String monitorFormat) throws FileNotFoundException {
	        this.matrix = matrix;
	        this.diagonal = diagonal;
	        this.name = name;
	        this.resolution = resolution;
	        this.hz = hz;
	        this.BrightDisplay = BrightDisplay;
	        this.TVFormat = monitorFormat;
	        myWrite = new PrintWriter("Log.txt");
	    }

	    /**
	     * Method returns TV refresh rate
	     * @return TV refresh rate
	     */
	    public double getHz() {
	        return hz;
	    }

	    /**
	     * Method returns TV name
	     * @return TV name
	     */
	    public String getName() {
	        return name;
	    }

	    /**
	     * Method returns TV resolution
	     * @return TV resolution
	     */
	    public String getResolution() {
	        return resolution;
	    }

	    /**
	     * Method returns TV diagonal
	     * @return TV diagonal
	     */
	    public double getDiagonal() {
	        return diagonal;
	    }

	    /**
	     * Method returns TV matrix type
	     * @return TV matrix type
	     */
	    public String getMatrix() {
	        return matrix;
	    }

	    /**
	     * Method returns TV display brightness
	     * @return TV display brightness
	     */
	    public double getBrightDisplay() {
	        return BrightDisplay;
	    }

	    /**
	     * Method sets the new TV refresh rate
	     * @param hz <code>hz</code> TV refresh rate
	     */
	    public void setHz(double hz) {
	        this.hz = hz;
	    }

	    /**
	     * Method sets the new TV name
	     * @param name <code>name</code> TV name
	     */
	    public void setName(String name) {
	        this.name = name;
	    }

	    /**
	     * Method sets the new TV resolution and format
	     * @param resolution <code>resolution</code> TV resolution
	     * @param monitorFormat <code>monitorFormat</code> TV screen format
	     */
	    public void setResolution(String resolution, String TVFormat) {
	        this.resolution = resolution;
	        this.TVFormat = TVFormat;
	    }

	    /**
	     * Method sets the new TV diagonal
	     * @param diagonal <code>diagonal</code> TV diagonal
	     */
	    public void setDiagonal(double diagonal) {
	        this.diagonal = diagonal;
	    }

	    /**
	     * Method sets the new TV matrix type
	     * @param matrix <code>matrix</code> TV matrix type
	     */
	    public void setMatrix(String matrix) {
	        this.matrix = matrix;
	    }

	    /**
	     * Method sets the new TV display brightness
	     * @param brightDisplay <code>brightDisplay</code> TV display brightness
	     */
	    public void setBrightDisplay(double brightDisplay) {
	        BrightDisplay = brightDisplay;
	    }

	    /**
	     * Method simulates TV off/on
	     */
	    public void off_onTV(Status comand) {
	        if (comand == Status.ON) {
	            myWrite.println("Монітор включено.");
	            status = Status.ON;
	        } else {
	            status = Status.OFF;
	            myWrite.println("Монітор виключено.");
	        }
	    }

	    /**
	     * Method return TV settings which we set
	     */
	    public void getSettings() {
	        if (status == Status.ON) {
	            System.out.println("Name - " + name);
	            System.out.println("Diagonal - " + diagonal);
	            System.out.println("Resolution - " + resolution);
	            System.out.println("Hz - " + hz);
	            System.out.println("Matrix - " + matrix);
	            System.out.println("Bright - " + BrightDisplay);
	            myWrite.println("Налаштування монітора виведенно.");
	        } else {
	            System.out.println("Your TV is off!!! ");
	            myWrite.println("Налаштування телевізора не виведено, та як монітор виключенно.");
	        }

	    }

	    /**
	     * Method simulates increment TV display brightness
	     */
	    public void brightDisplayPlus(int change) {
	        BrightDisplay = BrightDisplay + change;
	        myWrite.println("Яскравість телевізора збільшенна.");
	    }

	    /**
	     * Method simulates decrement TV display brightness
	     */
	    public void brightDisplayMinus(int change) {
	        BrightDisplay = BrightDisplay - change;
	        myWrite.println("Яскравість телевізора зменшенна.");
	    }

	    /**
	     * Method simulates changing TV matrix type
	     */
	    public void changeMatrix(String mat) {
	        System.out.println("Selected matrix - " + matrix);
	        myWrite.println("Матриця телевізора зміненна з " + matrix + " на " + mat);
	        matrix = mat;
	        System.out.println("Matrix changed - " + matrix);
	    }

	    /**
	     * Method simulates changing TV refresh rate
	     */
	    public void changeHz(int hz) {
	        if (status == Status.ON) {
	            System.out.println("Selected Hz - " + this.hz);
	            myWrite.println("Частота оновлення телевізора зміненна з " + this.hz + " на " + hz);
	            this.hz = hz;
	            System.out.println("Hz changed - " + hz);

	        } else {
	            System.out.println("Your TV is off!!! ");
	            myWrite.println("Частота оновлення телевізора не зміненна, та як телевізор виключенно.");
	        }
	    }

	    /**
	     * Method simulates changing TV name
	     */
	    public void changeName(String name) {
	        System.out.println("Selected name - " + name);
	        myWrite.println("Назва телевізора зміненна з " + this.name + " на " + name);
	        this.name = name;
	        System.out.println("Name changed - " + name);

	    }

	    /**
	     * Method simulates changing TV resolution
	     */
	    public void changeResolution(String resolution) {
	        if (status == Status.ON) {
	            System.out.println("Selected resolution - " + this.resolution);
	            myWrite.println("Розширення телевізора зміненно з " + this.resolution + " на " + resolution);
	            this.resolution = resolution;
	            System.out.println("Resolution changed - " + this.resolution);

	        } else {
	            System.out.println("Your TV is off!!! ");
	            myWrite.println("Розширення телевізора не зміненно, та як телевізор виключенно.");
	        }
	    }

	    /**
	     * Method simulates changing TV screen format
	     */
	    public void changeMonitorFormat(String monitorFormat) {
	        if (monitorFormat == "16:9") {
	            this.TVFormat = monitorFormat;
	            System.out.println("TV format changed - " + monitorFormat);
	            System.out.println("Max resolution for this format is 2560 x 1440.");
	            myWrite.println("Формат телевізора зміненно на - " + monitorFormat);
	        } else if (monitorFormat == "4:3") {
	            this.TVFormat = monitorFormat;
	            System.out.println("TV format changed - " + monitorFormat);
	            System.out.println("Max resolution for this format is 1440x1080.");
	            myWrite.println("Формат телевізора зміненно на - " + monitorFormat);
	        } else if (monitorFormat == "16:10") {
	            this.TVFormat = monitorFormat;
	            System.out.println("TV format changed - " + monitorFormat);
	            System.out.println("Max resolution for this format is 1920x1200.");
	            myWrite.println("Формат телевізора зміненно на - " + monitorFormat);
	        } else {
	            System.out.println("Input incorrect TV format!");
	            myWrite.println("Формат телевізора не зміненно, некоректне введення.");
	        }
	    }

	    /**
	     * Method releases used recourses
	     */
	    public void dispose()
	    {
	        myWrite.flush();
	        myWrite.close();
	    }
	}