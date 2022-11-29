
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;


public class EquantionsApp {

    /** 
     * @param args
     */
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            PrintWriter fout = new PrintWriter(new File("LAB_05"));
            try {
                try {
                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    fout.print(eq.Lab(in.nextInt()));
                }
                finally {
                    fout.flush();
                    fout.close();
                }
            }
            catch (Exception ex) {
                System.out.print(ex.getMessage());
            }
        }
        catch (FileNotFoundException ex) {
        	System.out.print("Exception reason: Perhaps wrong file path"); 
        }
    }
}
class Lab extends Exception {
    /**
    *Constructor
    */ 
    public Lab(){}
    
    /**
    *Constructor
    * @param cause
    */ 
    public Lab(String cause) {
        super(cause);
    }
}


/**
* Клас CalcException реалізує користувацьке виключення
*/
//class CalcException extends ArithmeticException {
//    /**
//    *Constructor
//    */ 
//    public CalcException(){}
//    
//    /**
//    *Constructor
//    * @param cause
//    */ 
//    public CalcException(String cause) {
//        super(cause);
//    }
//}

/**
* Клас Equations реалізує обчислення виразу
*/
class Equations {

    /** 
     * @param x
     * @throws CalcException 
     */
//    public double calculate(int x) throws CalcException {
//    	 double y, rad;
//         rad = x;
//         try {
//             y = Math.cos(rad) / Math.tan(2 * rad);
//             if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || x == 90 || x == -90)
//                 throw new ArithmeticException();
//
//         } catch (ArithmeticException ex) {
//            
//             if (rad == 0 || rad == Math.PI  || rad == 2 * Math.PI)
//                 throw new CalcException("Exception reason: Illegal value of X for cotangent calculation");
//             else if (rad == Math.PI / 2.0 || rad == -Math.PI / 2.0)
//                 throw new CalcException("Exception reason: Divide by zero");
//             else
//                 throw new CalcException("Unknown reason of the exception during exception calculation");
//         }
//         out.println(y);
//         return y;
//     }

public double Lab(int x) throws Lab {
	 double y, rad;
    rad = x;
    try {
        y = 20 / rad;
        if ( x == 0 )
            throw new Exception();

    } catch (Exception ex) {
       
        if (rad == 0)
            throw new Lab("Exception reason: Divide by zero");
        else
            throw new Lab("Unknown reason of the exception during exception calculation");
    }
    out.println(y);
    return y;
}
}