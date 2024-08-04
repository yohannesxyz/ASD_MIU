package miu.edu;

public class ItalicDecorator implements Text {
    private Text text;

    public ItalicDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getHTML() {
        return "<i>" + text.getHTML() + "</i>";
    }
}