package LAB_04;

import java.io.*;

public class TunerButton {
    private Status status;
    private PrintWriter myWrite;
  
    public TunerButton() throws FileNotFoundException {
        status = Status.OFF;
        myWrite = new PrintWriter("Log.txt");
    }
    /**
     * Method simulates TV`s off/on
     */
    public void off_onTV(Status comand) {
        if (comand == Status.ON) {
            myWrite.println("TV on.");
            status = Status.ON;
        } else {
            status = Status.OFF;
            myWrite.println("TV off.");
        }
    }
    /**
     * Method returns TV`s status off/on
     * @return TV`s status off/on
     */
    public Status getStatus() {
        return status;
    }
   
    public void setStatus(Status status) {
        this.status = status;
    }
}