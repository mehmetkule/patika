public class Book implements Comparable <Book> {
    private String bookName;
    private int bookPages;
    private int bookYear;
    private String author;

    public Book() {
    }

    public Book(String bookName, int bookPages, int bookYear, String author) {
        this.bookName = bookName;
        this.bookPages = bookPages;
        this.bookYear = bookYear;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPages=" + bookPages +
                ", bookYear=" + bookYear +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.bookName);
    }
}
