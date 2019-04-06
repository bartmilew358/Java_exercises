package pl.sda.mini_project;

import pl.sda.mini_project.books.Book;
import pl.sda.mini_project.books.BookType;

import java.util.*;
import java.util.stream.Collectors;

public class BooksManager {
    private List<Book> books;

    public BooksManager () {
        books = createBooks();

    }
    public List<Book> findBooks() {
        return books;
    }


    public void addBook(String author, String title, BookType type) {

        books.add(new Book(author, title, BookType.HISTORICAL));

    }

    public boolean deleteBook(int bookId) {

        books.remove(bookId - 1);
        return false;
    }

    public List<Book> getSortedByAuthor() {

        Comparator<Book> a = Comparator.comparing(Book::getAuthor).thenComparing(Book::getAuthor);

        Collections.sort(books, a);
        return books;
    }

    public List<Book> getSortedByType() {
        return null;
    }

    private List<Book> createBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Henryk Sienkiewicz", "Ogniem i mieczem", BookType.HISTORICAL));
        books.add(new Book("Juliusz Słowacki", "Balladyna", BookType.DRAMA));
        books.add(new Book("Agatha Cristie", "Morderstwo w Orient Expressie", BookType.DETECTIVE_STORY));
        books.add(new Book("Agatha Cristie", "Śmierć na Nilu", BookType.DETECTIVE_STORY));
        books.add(new Book("Juliusz Słowacki", "Oda do wolności", BookType.POETRY));
        books.add(new Book("Henryk Sienkiewicz", "Quo vadis", BookType.HISTORICAL));
        books.add(new Book("Norman Davies", "Boże igrzysko. Historia Polski", BookType.HISTORICAL));

        return books;
    }
}