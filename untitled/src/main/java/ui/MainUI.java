package ui;

import javax.swing.*;
import java.awt.*;

public class MainUI {

    public static void main(String... args) {

            MethodsUI methodsUI = new MethodsUI();

            JFrame panel = new JFrame("NIC tools");

            ImageIcon favicon = new ImageIcon("src/main/java/img/Icon.png");
            Image image = favicon.getImage().getScaledInstance(150, 70, Image.SCALE_SMOOTH);

            JLabel label = new JLabel("Please select your tool:");
            label.setBounds(5, 0, 150, 50);


            JButton validator = new JButton("Validator");
            validator.setBounds(170, 20, 93, 25);
            validator.addActionListener(e -> {

                    panel.dispose();
                    methodsUI.makeValidator();


            });

            JButton generator = new JButton("Generator");
            generator.setBounds(170, 70, 93, 25);
            generator.addActionListener(e -> {

                    panel.dispose();
                    methodsUI.makeGenerator();


            });
            JLabel img = new JLabel(favicon);
            img.setIcon(new ImageIcon(image));
            img.setBounds(5, 40, 150, 70);


        MethodsUI.panelMaker(panel, label, favicon);
            panel.add(validator);
            panel.add(generator);
            panel.add(img);
        }

    }
