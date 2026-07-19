package ui;

import ui.component.CustomButton;
import ui.component.CustomFrame;
import ui.component.CustomLabel;
import ui.component.CustomMenu;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MainUI {

    public static void main(String... args) {

        new JTextField();

        MethodsUI methodsUI = new MethodsUI();

        CustomFrame panel = new CustomFrame("NIC tools");

        CustomLabel label = new CustomLabel("Please select your tool:", 5, 0, 150, 50);

        CustomButton validator = new CustomButton("Validator", 20);
        validator.addActionListener(e -> {
            panel.dispose();
            methodsUI.makeValidator();
        });

        CustomButton generator = new CustomButton("Generator", 70);
        generator.addActionListener(e -> {

            panel.dispose();
            methodsUI.makeGenerator();


        });

        CustomMenu img = new CustomMenu(new ImageIcon(
                Objects.requireNonNull(CustomLabel.class.getResource("/img/Icon2.png"))
        ));

        panel.add(label);
        panel.add(validator);
        panel.add(generator);
        panel.add(img);
        panel.revalidate();
        panel.repaint();
    }

}
