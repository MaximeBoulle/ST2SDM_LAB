package controller;

import service.BorrowingService;
import service.PenaltyService;
import model.Borrowing;
import model.Book;
import model.Subscriber;

public class BorrowingController {
    private BorrowingService borrowingService = new BorrowingService();
    private PenaltyService penaltyService = new PenaltyService();

    public void borrowBook(Subscriber s, Book b) {
        borrowingService.borrowBook(s, b);
    }

    public void returnBook(Borrowing b) {
        borrowingService.returnBook(b);
    }

    public double calculatePenalty(Borrowing b) {
        return penaltyService.calculatePenalty(b);
    }
}
