package lab_4;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Samsung sm = new Samsung(new ChannelList(18), new RemController(10, 5));
        int choice;
        while(true) {
            System.out.println("What do you want?(1 - change settings, 2 - Turn the tuner on, 0 - exit)");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the value of brightness:");
                int brght = sc.nextInt();
                sm.setBright(brght);
                System.out.println("Enter the value of contrast:");
                int cntr = sc.nextInt();
                sm.setContr(cntr);
                System.out.println("Enter the value of number of channel:");
                int chpos = sc.nextInt();
                sm.setChannelPos(chpos);
                System.out.println("Enter the value of volume:");
                int volm = sc.nextInt();
                sm.setVol(volm);
                System.out.println("Enter the value of Saturation:");
                int satr = sc.nextInt();
                sm.setSatur(satr);
            } else if (choice == 2) {
                System.out.println("What option you want to choose?(1-TV programs, 2-FM Radio, 3-Find the movie");
                int choice2 = sc.nextInt();
                String name1;
                if(choice2==1) {
                    System.out.println("Write the name of TV program:");
                    sc.nextLine();
                    name1 = sc.nextLine();
                    sm.TVPrograms(name1);
                    System.out.println("Press any button");
                    sc.nextLine();
                }
                else if(choice2==2) {
                    System.out.println("Write the name of RadioStation:");
                    sc.nextLine();
                    name1 = sc.nextLine();
                    sm.FMRadio(name1);
                    System.out.println("Press any button");
                    sc.nextLine();
                }
                else if(choice2==3) {
                    System.out.println("Write the name of movie:");
                    sc.nextLine();
                    name1 = sc.nextLine();
                    sm.MoviePlayer(name1);
                    System.out.println("Press any button");
                    sc.nextLine();
                }
                else System.out.println("Wrong option...");


            } else if (choice == 0) {
                break;
            } else System.out.println("Wrong button..");
        }

        sm.closeFile();
    }
}
