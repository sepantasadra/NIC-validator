package validator;

import java.util.ArrayList;



public class ValidateMethods<nic> {



    public static ArrayList<Integer> makeArrayList(String nicString) {

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


    public static boolean sizeValidate(String nic) {

        if (8 <= nic.length() && nic.length() <= 10) {

            return true;

        }
        return false;
    }

    ArrayList<Integer> nic = new ArrayList<>();

    public static boolean validateNic(ArrayList<Integer> nic) {

        int sum = 0;

        for (int i = 0; i < nic.size(); i++) {

            nic.set(i,nic.get(i)*(i+1));
        }

        for (int i = 1; i < nic.size(); i++) {

            sum += nic.get(i);
        }

        int mod = sum % 11;

        boolean validate;

        if (mod >= 2 ) {

            validate = (11 - mod == nic.get(0));

        } else {

            validate = (mod == nic.get(0));
        }

        return validate;
    }




}
