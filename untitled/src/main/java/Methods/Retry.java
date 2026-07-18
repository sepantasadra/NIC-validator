package Methods;

import java.util.Scanner;

public class Retry {

    public static boolean askForRetry() {

        Scanner scanner = new Scanner(System.in);

        int breakLoop = 0;

        while (breakLoop!=3) {

            System.out.println("Do you wanna retry? [Y]es/[N]o");
            String answer = scanner.nextLine();
            breakLoop++;

            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {

                return true;

            } else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {

                return false;

            } else {

                System.out.println("Pls enter correct answer!");


            }

        }

        return false;
    }

    public static String askForToolRetry() {

        Scanner scanner = new Scanner(System.in);

        int breakLoopTool = 0;

        while (breakLoopTool!=3) {

            System.out.println("Pls choose your tool: [G]enerate / [V]alidate:");
            String tool = scanner.nextLine();
            breakLoopTool++;

            if (tool.equalsIgnoreCase("v")) {

                return "v";

            } else if (tool.equalsIgnoreCase("g")) {

                return "g";

            } else {

                if (breakLoopTool !=3) {
                    System.out.println("Pls enter correct answer!");
                }


            }

        }

        return "End";
    }
}
