package controller;

import service.BorrowingService;
import model.Book;
import model.Subscriber;

public class ReservationController {
    private BorrowingService borrowingService = new BorrowingService();

    public void reserveBook(Subscriber s, Book b) {
        borrowingService.reserveBook(s, b);
    }
}
