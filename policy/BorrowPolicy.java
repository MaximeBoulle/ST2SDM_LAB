package policy;

import model.Book;
import model.Subscriber;

public abstract class BorrowPolicy {
    public abstract void BorrowBook(Subscriber subscriber, Book book);
}

class PhysicalBookPolicy extends BorrowPolicy {
    @Override
    public void BorrowBook(Subscriber subscriber, Book book) {
        // Logic for borrowing a physical book
        // For example, check if the subscriber can borrow the book,
        // update the borrowing records, etc.
    }
}

class DigitalBookPolicy extends BorrowPolicy {
    @Override
    public void BorrowBook(Subscriber subscriber, Book book) {
        // Logic for borrowing a digital book
        // For example, check if the subscriber can borrow the book,
        // update the borrowing records, and provide access to the digital content.
    }

}
