package miu.edu;

public class Main {
    public static void main(String[] args) {
        Text plainText = new PlainText("Hello, World!");

        Text boldText = new BoldDecorator(plainText);
        Text italicText = new ItalicDecorator(plainText);
        Text underlineText = new UnderlineDecorator(plainText);
        Text strikethroughText = new StrikethroughDecorator(plainText);

        Text boldStrikethroughText = new StrikethroughDecorator(boldText);
        Text boldItalicUnderlineStrikethroughText = new StrikethroughDecorator(
                new UnderlineDecorator(
                        new ItalicDecorator(
                                new BoldDecorator(plainText)
                        )
                )
        );

        System.out.println("Plain Text: " + plainText.getHTML());
        System.out.println("Bold: " + boldText.getHTML());
        System.out.println("Italic: " + italicText.getHTML());
        System.out.println("Underline: " + underlineText.getHTML());
        System.out.println("Strikethrough: " + strikethroughText.getHTML());
        System.out.println("Bold + Strikethrough: " + boldStrikethroughText.getHTML());
        System.out.println("Bold + Italic + Underline + Strikethrough: " + boldItalicUnderlineStrikethroughText.getHTML());

    }
}