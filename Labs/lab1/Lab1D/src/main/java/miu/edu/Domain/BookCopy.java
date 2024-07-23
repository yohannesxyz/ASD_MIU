package miu.edu.Domain;

public class BookCopy {
    private int copyNum;
    private Book book;

    public BookCopy(int copyNum, Book book) {
        this.copyNum = copyNum;
        this.book = book;
    }

    public int getCopyNum() {
        return copyNum;
    }

    public void setCopyNum(int copyNum) {
        this.copyNum = copyNum;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookCopy{" + "copyNum=" + copyNum + ", book=" + book + '}';
    }
}
