package ui.component;

import javax.swing.*;

public class CustomTextField extends JTextField {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final boolean editable;

    public CustomTextField(boolean editable) {
        this.x = 10;
        this.y = 60;
        this.width = 150;
        this.height = 30;
        this.editable = editable;
        init();
    }

    private void init() {
        setEditable(editable);
        setBounds(x,y,width,height);
    }
}
