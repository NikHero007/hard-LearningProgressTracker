package tracker;

import java.util.Scanner;

public class Tracker {
    private Scanner sc = new Scanner(System.in);

    private String command = "";

    public void startTracking() {
        System.out.println("Learning Progress Tracker");

        do {
            command = sc.nextLine().trim();

            switch(command) {
                case "" :
                    System.out.println("No input");
                    break;
                case "exit" :
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Unknown command!");
                    break;
            }
        } while(!command.equals("exit"));

    }
}
