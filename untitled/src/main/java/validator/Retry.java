package validator;

import java.util.Scanner;

public class Retry {

    ;

    public static boolean askForRetry() {

        Scanner scanner = new Scanner(System.in);

        int breakLoop = 0;

        while (breakLoop!=3) {

            System.out.println("Do you wanna retry?");
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
}
