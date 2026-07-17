package validator;

import java.util.ArrayList;
import java.util.Scanner;

import static validator.ValidateMethods.*;

public class Main {

    public static void main(String[] args) {

        boolean retry = true;

        while (retry) {

            Scanner scanner = new Scanner(System.in);



            System.out.println("Pls enter your NIC:");
            String nicString = scanner.nextLine();


            ValidateMethods<Object> objectValidateMethods = new ValidateMethods<>();


            if (!sizeValidate(nicString)) {
                System.out.println("Incorrect length for NIC!");
            } else {

                ArrayList<Integer> nic = makeArrayList(nicString);
                boolean result = validateNic(nic);

                if (result) {
                    System.out.println("Valid NIC!");


                } else {
                    System.out.println("NIC is not valid!");
                }
            }

            retry = Retry.askForRetry();

        }

        System.out.println("Good Bye!");
    }
}
