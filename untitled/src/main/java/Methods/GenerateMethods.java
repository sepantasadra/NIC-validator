package Methods;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class GenerateMethods {


    public String generateNic() {

        ArrayList<Integer> nic = new ArrayList<>();
        String nicString = "";
        boolean valid = false;

        while (!valid) {

            nic.clear();

            for (int i = 0; i < 10; i++) {

                nic.add(ThreadLocalRandom.current().nextInt(0, 10));
            }

            valid = ValidateMethods.validateNic(nic);
        }


        for (int i = 0; i < 10; i++) {

            nicString += nic.get(i);
        }


        return nicString;
    }

}