package ui.component;

import ui.MainUI;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;


public class CustomFrame extends JFrame {
    private final String text;
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    ImageIcon favicon = new ImageIcon(
            Objects.requireNonNull(MainUI.class.getResource("/img/Icon.png"))
    );
    Image image = favicon.getImage().getScaledInstance(150, 70, Image.SCALE_SMOOTH);

    public CustomFrame(String text) {
        this.text = text;
        this.x = 630;
        this.y = 300;
        this.width = 300;
        this.height = 150;
        setLayout(null);
        setResizable(false);
        setIconImage(image);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        init();
    }

    private void init() {
        setTitle(text);
        setBounds(x, y, width, height);
    }
}
