package miu.edu;

public class UnderlineDecorator implements Text {
    private Text text;

    public UnderlineDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getHTML() {
        return "<u>" + text.getHTML() + "</u>";
    }
}