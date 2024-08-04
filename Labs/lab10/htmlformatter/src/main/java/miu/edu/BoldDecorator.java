package miu.edu;

public class BoldDecorator implements Text {
    private Text text;

    public BoldDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getHTML() {
        return "<b>" + text.getHTML() + "</b>";
    }
}