package service;
import java.util.*;

import model.Book;
import model.Borrowing;
import model.Reservation;
import model.Subscriber;
import policy.BorrowPolicy;

public class BorrowingService {
    private List<Borrowing> borrowings = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    private BorrowPolicy borrowPolicy;

    public void borrowBook(Subscriber s, Book b) {
        borrowPolicy.BorrowBook(s,b);
    }

    public void returnBook(Borrowing b) {
        // Logic to return a book
    }

    public void reserveBook(Subscriber s, Book b) {
        // Logic to reserve a book
    }

    // Other borrowing-related methods can be added here
}
