import java.util.*;
import observer.SubscriberObserver;
import strategy.PenaltyCalculationStrategy;
import controller.BorrowingController;
import controller.ReservationController;
import controller.SubscriberController;

public abstract class LibraryManager implements IBookRepository {
    private static LibraryManager instance;

    protected List<Book> books = new ArrayList<>();
    private BorrowingController borrowingController = new BorrowingController();
    private ReservationController reservationController = new ReservationController();
    private SubscriberController subscriberController = new SubscriberController();
    private PenaltyCalculationStrategy penaltyCalculationStrategy;
    private List<SubscriberObserver> observers = new ArrayList<>();

    protected LibraryManager() {}

    public static synchronized LibraryManager getInstance() {
        if (instance == null) {
            instance = createLibraryManager();
        }
        return instance;
    }

    protected abstract LibraryManager createLibraryManager();

    public void setPenaltyCalculationStrategy(PenaltyCalculationStrategy strategy) {
        this.penaltyCalculationStrategy = strategy;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void register(Subscriber s) {
        subscriberController.register(s);
    }

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
        if (penaltyCalculationStrategy != null) {
            return penaltyCalculationStrategy.calculatePenalty(b);
        }
        return borrowingController.calculatePenalty(b); // Default behavior
    }

    public void addObserver(SubscriberObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(SubscriberObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(Book book) {
        for (SubscriberObserver observer : observers) {
            observer.update(book);
        }
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