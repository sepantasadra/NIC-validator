package validator;

import java.util.ArrayList;
import java.util.Scanner;

import Methods.NIC;
import Methods.AskUser;

import static Methods.NIC.*;

public class Main {
    public static void main(String[] args) {

        boolean retry = true;
        String toolRetry;
        Scanner scanner = new Scanner(System.in);
        NIC nicObject = new NIC();

        while (retry) {

            toolRetry = AskUser.askForToolRetry();

            if (toolRetry.equals("v")) {

                System.out.println("Pls enter your NIC:");
                String nicString = scanner.nextLine();


                if (nicObject.sizeValidate(nicString)) {
                    System.out.println("Incorrect length for NIC!");
                } else {

                    ArrayList<Integer> nic = nicObject.makeArrayList(nicString);
                    boolean result = validateNic(nic);

                    if (result) {
                        System.out.println("Valid NIC!");


                    } else {
                        System.out.println("NIC is not valid!");
                    }
                }

                retry = AskUser.askForRetry();

            } else if (toolRetry.equals("g")){

                System.out.println(nicObject.generateNic());

                retry = AskUser.askForRetry();

            } else {
                retry = false;
            }
        }

        System.out.println("Good Bye!");
    }
}