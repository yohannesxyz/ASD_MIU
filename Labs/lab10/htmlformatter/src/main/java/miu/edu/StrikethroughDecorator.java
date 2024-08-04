package miu.edu;

public class StrikethroughDecorator implements Text {
    private Text text;

    public StrikethroughDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getHTML() {
        return "<s>" + text.getHTML() + "</s>";
    }
}