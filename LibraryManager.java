import java.util.*;

import repository.IBookRepository;
import service.PenaltyService;
import controller.BorrowingController;
import controller.ReservationController;
import controller.SubscriberController;
import model.Book;
import model.Borrowing;
import model.Subscriber;

public class LibraryManager implements IBookRepository {
    private static LibraryManager instance;

    private List<Book> books = new ArrayList<>();
    private BorrowingController borrowingController = new BorrowingController();
    private ReservationController reservationController = new ReservationController();
    private SubscriberController subscriberController = new SubscriberController();

    private LibraryManager() {}

    public static synchronized LibraryManager getInstance() {
        if (instance == null) {
            instance = new LibraryManager();
        }
        return instance;
    }

    public void addBook(Book book) { books.add(book); }

    public void removeBook(Book book) { books.remove(book); }

    public void register(Subscriber s) { subscriberController.register(s); }

    public void borrowBook(Subscriber s, Book b) {
        borrowingController.borrowBook(s, b);
    }

    public void returnBook(Borrowing b) {
        borrowingController.returnBook(b);
    }

    public void reserveBook(Subscriber s, Book b) {
        reservationController.reserveBook(s, b);
    }

    public double calculatePenalty(Borrowing b) {
        return borrowingController.calculatePenalty(b);
    }

    @Override
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    @Override
    public void removeBook(String bookId) {
        books.removeIf(book -> book.getId().equals(bookId));
    }

    // Other utility methods:
}