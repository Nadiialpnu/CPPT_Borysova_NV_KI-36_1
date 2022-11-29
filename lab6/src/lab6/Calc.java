package lab6;
import java.io.*;
import java.util.Scanner;



public class Calc {
    private double result, radian;

    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(new FileOutputStream(new File(fName), true));
        f.printf("%f\n ", this.result);
        f.close();
    }
    public void readResTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + " not found\n");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    public void writeResBin(String fName) throws FileNotFoundException, IOException
    {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();

    }

    public void readResBin(String fName) throws FileNotFoundException, IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }
    public void calculate(double x) throws CalcException {
    	 {
 	        double rad = x * Math.PI / 180.0;
 	        result = Math.tan(rad);
 	    }
    }
    
    public double getResult()
    {
        return result;
    }

}