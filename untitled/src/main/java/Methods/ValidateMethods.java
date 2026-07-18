package Methods;

import java.util.ArrayList;



public class ValidateMethods<nic> {



    public ArrayList<Integer> makeArrayList(String nicString) {

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

        if (8 <= nic.length() && nic.length() <= 10) {

            return true;

        }
        return false;
    }

    public static boolean validateNic(ArrayList<Integer> nic) {

        ArrayList<Integer> nic2 = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < 10; i++) {

            nic2.add(nic.get(i)*(i+1));
        }

        for (int i = 1; i < 10; i++) {

            sum += nic2.get(i);
        }

        int mod = sum % 11;

        boolean validate;

        if (mod >= 2 ) {

            validate = (11 - mod == nic2.get(0));

        } else {

            validate = (mod == nic2.get(0));
        }

        return validate;
    }




}
