import model.Book;
import model.Borrowing;
import model.Subscriber;

package service;
public interface IBorrowingService {
    void borrowBook(Subscriber s, Book b);
    void returnBook(Borrowing b);
}
