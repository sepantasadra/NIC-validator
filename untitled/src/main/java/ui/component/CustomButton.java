package ui.component;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    private final String text;
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public CustomButton(String text,int y) throws HeadlessException {

        this.text = text;
        this.x = 170;
        this.y = y;
        this.width = 93;
        this.height = 25;

        init();
    }

    public CustomButton(String text, int x, int y, int width, int height) {
        this.text = text;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        init();
    }

    private void init(){
        setText(text);
        setBounds(x,y,width,height);
    }
}
