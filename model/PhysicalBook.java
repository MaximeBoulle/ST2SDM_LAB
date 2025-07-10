package model;
public class PhysicalBook extends Book {
    private int copyCount;
    private int availableCopies;

    public PhysicalBook(String title, String author, String category, String ISBN, String language, int publicationYear, String bookID, boolean isRestricted, String series, int copyCount, int availableCopies) {
        super(title, author, category, ISBN, language, publicationYear, bookID, isRestricted, series); // Call Book constructor
        this.copyCount = copyCount;
        this.availableCopies = availableCopies;
    }

    // Getters and setters
}