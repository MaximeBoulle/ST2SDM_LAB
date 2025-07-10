package model;
public class DigitalBook extends Book {
    private int availableLicenses;

    public DigitalBook(String title, String author, String category, String ISBN, String language, int publicationYear, String bookID, boolean isRestricted, String series, int maxLicenses, int availableLicenses) {
        super(title, author, category, ISBN, language, publicationYear, bookID, isRestricted, series); // Call Book constructor
        this.availableLicenses = availableLicenses;
    }

    // Getters and setters
}