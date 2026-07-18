package ui.component;
import javax.swing.*;
import java.awt.*;

public class CustomMenu extends BaseLabel{

    public CustomMenu(ImageIcon favicon) {
        super(70,40);
        init(favicon);
    }

    private void init(ImageIcon favicon){
        Image image = favicon.getImage().getScaledInstance(150, 70, Image.SCALE_SMOOTH);
        setIcon(new ImageIcon(image));
    }
}
