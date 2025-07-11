package observer;

import model.Book;

public interface SubscriberObserver {
    void update(Book book);
}
