package miu.edu;

public class PlainText implements Text {
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String getHTML() {
        return text;
    }
}