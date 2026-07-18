package ui;

import javax.swing.*;
import java.awt.*;

public class MainUI {

    public static void main(String... args) {

            MethodsUI methodsUI = new MethodsUI();

            JFrame pannel = new JFrame("NIC tools");

            ImageIcon imgicon = new ImageIcon("src/main/java/img/Icon.png");
            Image image = imgicon.getImage().getScaledInstance(150, 70, Image.SCALE_SMOOTH);

            JLabel label = new JLabel("Please select your tool:");
            label.setBounds(5, 0, 150, 50);


            JButton validator = new JButton("Validator");
            validator.setBounds(170, 20, 93, 25);
            validator.addActionListener(e -> {

                    pannel.dispose();
                    methodsUI.makeValidator();


            });

            JButton generator = new JButton("Generator");
            generator.setBounds(170, 70, 93, 25);
            generator.addActionListener(e -> {

                    pannel.dispose();
                    methodsUI.makeGenarator();


            });
            JLabel img = new JLabel(imgicon);
            img.setIcon(new ImageIcon(image));
            img.setBounds(5, 40, 150, 70);



            pannel.setBounds(630, 300, 300, 150);
            pannel.setLayout(null);
            pannel.setVisible(true);
            pannel.setResizable(false);
            pannel.setIconImage(imgicon.getImage());

            pannel.add(label);
            pannel.add(validator);
            pannel.add(generator);
            pannel.add(img);
        }

    }
