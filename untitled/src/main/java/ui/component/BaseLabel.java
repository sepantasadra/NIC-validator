package ui.component;

import javax.swing.*;

public class BaseLabel extends JLabel {
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public BaseLabel(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        init();
    }

    public BaseLabel(int height,int y) {
        this.x = 5;
        this.y = y;
        this.width = 150;
        this.height = height;

        init();
    }

    private void init(){
        setBounds(x,y,width,height);
    }
}
