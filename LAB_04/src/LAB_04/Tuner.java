package LAB_04;

import java.io.FileNotFoundException;


public class Tuner extends TV implements Connection {
    protected int signal;
    private TunerButton status;
    protected final double connectionConst = 2.5;
    protected double connection;

    /**
     * Constructor
     * @throws FileNotFoundException param
     */

    public Tuner() throws FileNotFoundException {
        signal = 0;
        connection = 0.0;
    }

    public Tuner(int resource, double presForce, String name, double brightDisplay, String matrix, double diagonal, String resolution, double hz, String monitorFormat) throws FileNotFoundException{
        this.signal = signal;
        this.connection = connection;
        status = new TunerButton();
    }

    /**
     * Method simulates changing touch monitor`s resource
     */
    public void SignalTuner(int touches) {
        if (super.getStatus().getStatus() == Status.ON)
        {
            if (connection < connectionConst) {
                signal = signal - touches;
                myWrite.println("Сигнал прийому тюнера зменшенно на " + touches);
            } else {
                aboveTheNorm(touches);
                myWrite.println("Сигнал прийому тюнера зменшенно на " + error * touches);
            }
        }
        else{
            myWrite.println("Телевізор виключено.");
        }

    }

    public void getSignal()
    {
        System.out.println("Touch monitor resource  - " + signal);
        myWrite.println("Сигнал прийому тюнера виведенно.");
    }


    @Override
    public void aboveTheNorm(int touches) {
    	signal = signal - touches * error;
    }


}