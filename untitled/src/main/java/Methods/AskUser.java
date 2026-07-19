package Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class AskUser {

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

    public String removing_spaces(String nicString) {

        ArrayList<String> spaceRemovedNic = new ArrayList<>();
        StringBuilder userInput = new StringBuilder();

        for (int i = 0 ; i < nicString.length(); i++) {

            String x = String.valueOf(nicString.charAt(i));
            spaceRemovedNic.add(x);
            spaceRemovedNic.remove(" ");
        }

        for (String s : spaceRemovedNic) {

            userInput.append(s);
        }
        return userInput.toString();
    }

    public ArrayList<Integer> makeArrayList(String nicString) {


        nicString = removing_spaces(nicString);

        ArrayList<Integer> nic = new ArrayList<>();


        for (int i = nicString.length()-1; i >= 0; i--) {

            int x = Integer.parseInt(String.valueOf(nicString.charAt(i)));
            nic.add(x);
        }

        while (nic.size() < 10) {
            nic.add(0);
        }

        return nic;
    }


    public boolean sizeValidate(String nic) {


        int length = removing_spaces(nic).length();

        return 8 > length || length > 10;
    }

    public static boolean validateNic(ArrayList<Integer> nic) {

        ArrayList<Integer> nic2 = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < 10; i++) {

            nic2.add(nic.get(i) * (i + 1));
        }

        for (int i = 1; i < 10; i++) {

            sum += nic2.get(i);
        }

        int mod = sum % 11;

        boolean validate;

        if (mod >= 2) {

            validate = (11 - mod == nic2.get(0));

        } else {

            validate = (mod == nic2.get(0));
        }

        return validate;
    }
}
