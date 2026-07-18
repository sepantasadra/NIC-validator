package validator;

import java.util.ArrayList;
import java.util.Scanner;

import Methods.GenerateMethods;
import Methods.Retry;
import Methods.ValidateMethods;

import static Methods.ValidateMethods.*;

public class Main {
    public static void main(String[] args) {

        boolean retry = true;
        String toolRetry;
        Scanner scanner = new Scanner(System.in);
        ValidateMethods<Object> objectValidateMethods = new ValidateMethods<>();
        GenerateMethods generateMethods = new GenerateMethods();

        while (retry) {

            toolRetry = Retry.askForToolRetry();

            if (toolRetry.equals("v")) {

                System.out.println("Pls enter your NIC:");
                String nicString = scanner.nextLine();


                if (!objectValidateMethods.sizeValidate(nicString)) {
                    System.out.println("Incorrect length for NIC!");
                } else {

                    ArrayList<Integer> nic = objectValidateMethods.makeArrayList(nicString);
                    boolean result = validateNic(nic);

                    if (result) {
                        System.out.println("Valid NIC!");


                    } else {
                        System.out.println("NIC is not valid!");
                    }
                }

                retry = Retry.askForRetry();

            } else if (toolRetry.equals("g")){

                System.out.println(generateMethods.generateNic());

                retry = Retry.askForRetry();

            } else {
                retry = false;
            }
        }

        System.out.println("Good Bye!");
    }
}