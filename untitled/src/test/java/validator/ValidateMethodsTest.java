package validator;

import Methods.GenerateMethods;
import Methods.ValidateMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static Methods.ValidateMethods.validateNic;

class ValidateMethodsTest {

    @Test
    void should_Change_String_To_ArrayList() {

        String nicString = "7731689951  ";

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

        ValidateMethods objectValidateMethods = new ValidateMethods();

        String nic = "0056234565";

        System.out.println(validateNic(objectValidateMethods.makeArrayList(nic)));
    }

    @Test
    void generate() {

        GenerateMethods generateMethods = new GenerateMethods();
        ValidateMethods objectValidateMethods = new ValidateMethods();

        String generatedNic = generateMethods.generateNic();

        System.out.println(generatedNic);

        ArrayList<Integer> generatedNicArrayList = objectValidateMethods.makeArrayList(generatedNic);

        Assertions.assertTrue(ValidateMethods.validateNic(generatedNicArrayList));
    }

    @Test
    void should_remove_spaces() {

        ValidateMethods validateMethods = new ValidateMethods();

        System.out.println(validateMethods.removing_spaces("  0 4 044 35435 56  "));
    }
}