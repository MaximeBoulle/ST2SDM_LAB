package repository;
import java.util.List;

import model.Book;

public interface IBookRepository {
    List<Book> getBooks();
    void addBook(Book book);
    void removeBook(String bookId);
}