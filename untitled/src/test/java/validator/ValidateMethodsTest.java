package validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static validator.ValidateMethods.makeArrayList;
import static validator.ValidateMethods.validateNic;

class ValidateMethodsTest {

    @Test
    void should_Change_String_To_ArrayList() {

        String nicString = "7731689951";

        ArrayList<Integer> nic;

        ValidateMethods validateMethods = new ValidateMethods();

        nic = validateMethods.makeArrayList(nicString);

        System.out.println(nicString);
        System.out.println(nic);



    }

    @Test
    void should_Change_String_Size_To_10() {

        String nicString = "77316899";

        ArrayList<Integer> nic;

        ValidateMethods validateMethods = new ValidateMethods();

        nic = validateMethods.makeArrayList(nicString);

        System.out.println(nicString);
        System.out.println(nic);



    }

    @Test
    void validate() {

        String nic = "0056234565";

        System.out.println(validateNic(makeArrayList(nic)));
    }
}