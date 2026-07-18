package ui.component;

public class CustomLabel extends BaseLabel {
    private final String text;

    public CustomLabel(String text) {
        super(50,0);
        this.text = text;
        init();
    }

    public CustomLabel(String text, int x, int y, int width, int height) {
        super(x,y,width,height);
        this.text = text;
        init();

    }


    private void init(){
        setText(text);
    }
}