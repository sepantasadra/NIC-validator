package ui;

import Methods.GenerateMethods;
import Methods.ValidateMethods;
import java.awt.Color;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import java.awt.*;

import static Methods.ValidateMethods.validateNic;

public class MethodsUI {


    public void makeValidator() {

        ValidateMethods<Object> validateMethods = new ValidateMethods<>();

        JFrame pannel = new JFrame("NIC Validator");

        JLabel label = new JLabel("Please enter your NIC:");
        label.setBounds(5, 0, 150, 50);

        JTextField nic = new JTextField();
        nic.setEditable(true);
        nic.setBounds(10, 60, 150, 30);

        JLabel validation = new JLabel();
        validation.setBounds(190, 20, 70, 30);

        JButton done = new JButton("Done");
        done.setBounds(180, 60, 90, 30);
        validationButton(done, validateMethods, nic);

        homeMethod(pannel, label, nic, validation, done);


    }


    public void makeGenarator() {

        GenerateMethods generateMethods = new GenerateMethods();

        JFrame pannel = new JFrame("NIC Generator");

        JLabel label = new JLabel("Generate NIC:");
        label.setBounds(5, 0, 150, 50);

        JTextField nic = new JTextField();
        nic.setEditable(false);
        nic.setBounds(10, 60, 150, 30);
        nic.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                nic.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            }

            public void mouseExited(MouseEvent e) {
                nic.setBorder(BorderFactory.createLineBorder(Color.CYAN));
            }

            public void mouseClicked(MouseEvent e) {

                if (!nic.getText().isEmpty()) {
                    StringSelection selection = new StringSelection(nic.getText());
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

                    nic.setText("Text Copied!");
                }
            }
        });

        JButton done = new JButton("Generate");
        done.setBounds(180, 60, 90, 30);
        done.addActionListener(e -> {
            nic.setText(generateMethods.generateNic());
        });

        JLabel validation = new JLabel();
        validation.setBounds(190, 20, 70, 30);

        homeMethod(pannel, label, nic, validation, done);


    }

    private void homeMethod(JFrame pannel, JLabel label, JTextField nic, JLabel validation, JButton done) {
        JButton menu = new JButton("🏠");
        menu.setBounds(220, 5, 50, 20);
        menu.addActionListener(e -> {
            pannel.dispose();
            MainUI.main();
        });

        ImageIcon imgicon = new ImageIcon("src/main/java/img/Icon.png");


        pannel.setBounds(630, 300, 300, 150);
        pannel.setLayout(null);
        pannel.setVisible(true);
        pannel.setResizable(false);
        pannel.setIconImage(imgicon.getImage());

        pannel.add(label);
        pannel.add(nic);
        pannel.add(done);
        pannel.add(validation);
        pannel.add(menu);
    }

    private static void validationButton(JButton done, ValidateMethods<Object> validateMethods, JTextField nic) {
        done.addActionListener(e -> {

            if (done.getText().equals("Done")) {

                if (!validateMethods.sizeValidate(nic.getText())) {

                    nic.setEditable(false);
                    nic.setText("Incorrect input!");
                    done.setText("Retry");

                } else {

                    boolean validate = validateNic(validateMethods.makeArrayList(nic.getText()));

                    if (validate) {
                        nic.setEditable(false);
                        nic.setText("Valid NIC!");
                        done.setBackground(Color.green);
                        done.setText("Retry");

                    } else {

                        nic.setEditable(false);
                        nic.setText("NOT Valid NIC!");
                        done.setBackground(Color.red);
                        done.setText("Retry");
                    }
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