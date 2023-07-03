import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("The Lord of the Rings", 1000, 1954, "J. R. R. Tolkien"));
        books.add(new Book("The Lord of the Rings", 1000, 1954, "J. R. R. Tolkien"));
        books.add(new Book("The Hobbit", 300, 1937, "J. R. R. Tolkien"));
        books.add(new Book("The Silmarillion", 500, 1977, "J. R. R. Tolkien"));
        books.add(new Book("The Children of Húrin", 250, 2007, "J. R. R. Tolkien"));

        for (Book book : books) {
            System.out.println(book);
        }
    }
}