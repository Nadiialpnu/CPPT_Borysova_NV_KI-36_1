package LAB_04;

public class Display {
    private double brightDisplay;
    private String resolution;
    private double diagonal;

    public Display(){
        brightDisplay = 0.0;
        resolution = "None";
        diagonal = 0.0;
    }
    
    public Display(double brightDisplay, double diagonal, String resolution){
        this.brightDisplay = brightDisplay;
        this.resolution = resolution;
        this.diagonal = diagonal;
    }
   
    public double getBrightDisplay() {
        return brightDisplay;
    }
   
    public void setBrightDisplay(double brightDisplay) {
        this.brightDisplay = brightDisplay;
    }
   
    public String getResolution() {
        return resolution;
    }
    
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    
    public double getDiagonal() {
        return diagonal;
    }
    
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}