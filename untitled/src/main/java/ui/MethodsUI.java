package ui;

import Methods.NIC;
import ui.component.CustomButton;
import ui.component.CustomFrame;
import ui.component.CustomLabel;
import ui.component.CustomTextField;

import java.awt.Color;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import java.awt.*;

import static Methods.NIC.validateNic;

public class MethodsUI {

    NIC nicObject = new NIC();

    public void makeValidator() {



        CustomFrame panel = new CustomFrame("NIC Validator");

        CustomLabel label = new CustomLabel("Please enter your NIC:");

        CustomTextField nic = new CustomTextField(true);

        CustomButton done = new CustomButton("Done", 180, 60, 90, 30);
        validationButton(done, nicObject, nic);

        homeMethod(panel, label, nic, done);


    }


    public void makeGenerator() {

        CustomFrame panel = new CustomFrame("NIC Generator");

        CustomLabel label = new CustomLabel("Generate NIC:");

        CustomTextField nic = new CustomTextField(false);
        nic.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                nic.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            }

            public void mouseExited(MouseEvent e) {
                nic.setBorder(BorderFactory.createLineBorder(Color.CYAN));
            }

            public void mouseClicked(MouseEvent e) {

                if (!nic.getText().isEmpty() && !nic.getText().equals("Text Copied!")) {
                    StringSelection selection = new StringSelection(nic.getText());
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

                    nic.setText("Text Copied!");
                }
            }
        });

        CustomButton done = new CustomButton("Generate", 180, 60, 90, 30);
        done.addActionListener(e -> nic.setText(nicObject.generateNic()));

        homeMethod(panel, label, nic, done);


    }

    private void homeMethod(JFrame panel, JLabel label, JTextField nic, JButton done) {

        CustomButton menu = new CustomButton("🏠", 220, 5, 50, 20);
        menu.addActionListener(e -> {
            panel.dispose();
            MainUI.main();
        });

        panel.add(label);
        panel.add(nic);
        panel.add(done);
        panel.add(menu);
    }


    private static void validationButton(JButton done, NIC validateMethods, JTextField nic) {
        done.addActionListener(e -> {
            String userInput = nic.getText();

            if (done.getText().equals("Done")) {

                if (validateMethods.sizeValidate(userInput)) {

                    nic.setEditable(false);
                    nic.setText("Incorrect input!");
                    done.setText("Retry");

                } else {

                    boolean validate = validateNic(validateMethods.makeArrayList(userInput));

                    nic.setEditable(false);
                    if (validate) {
                        nic.setText("Valid NIC!");
                        done.setBackground(Color.green);

                    } else {

                        nic.setText("NOT Valid NIC!");
                        done.setBackground(Color.red);
                    }
                    done.setText("Retry");
                }

            } else {

                nic.setText("");
                nic.setEditable(true);
                done.setBackground(null);
                done.setText("Done");
            }
        });


    }
}