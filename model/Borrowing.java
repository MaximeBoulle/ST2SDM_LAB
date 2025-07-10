package model;
import java.util.Date;

public class Borrowing {
    private Subscriber subscriber;
    private Book book;
    private Date borrowDate;
    private Date dueDate;
    private boolean isRenewed;

    public Borrowing(Subscriber subscriber, Book book, Date borrowDate, Date dueDate) {
        this.subscriber = subscriber;
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.isRenewed = false;
    }

    // Getters and setters
    public Subscriber getSubscriber() {
        return subscriber;
    }

    public Book getBook() {
        return book;
    }

    public boolean isOverdue() {
        return new Date().after(dueDate);
    }

}