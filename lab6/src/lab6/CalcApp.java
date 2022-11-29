package lab6;

import java.io.IOException;
import java.util.Scanner;

public class CalcApp {
    public CalcApp() {
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Enter data: ");
        Scanner s = new Scanner(System.in);
        double data = s.nextDouble();
        Calc obj = new Calc();

        for(int i = 0; i < 5; ++i) {
            try {
                obj.calculate(data);
                ++data;
            } catch (CalcException var8) {
                System.out.println(var8.getMessage());
            }

            try {
                System.out.println("Result is: " + obj.getResult());
                obj.writeResTxt("Lab6.txt");
                obj.writeResBin("BinRes.bin");
                obj.readResBin("BinRes.bin");
                System.out.println("Result is(read from bin): " + obj.getResult());
                obj.readResTxt("Lab6.txt");
                System.out.println("Result is(read from txt): " + obj.getResult());
            } catch (IOException var7) {
                System.out.println(var7);
            }
        }

    }
}