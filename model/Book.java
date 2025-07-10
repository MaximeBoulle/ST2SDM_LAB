package model;
public abstract class Book {
    protected String title;
    protected String author;
    protected String category;
    protected String ISBN;
    protected String language;
    protected int publicationYear;
    protected String bookID;
    protected boolean isRestricted;
    protected String series;

    public Book(String title, String author, String category, String ISBN, String language,
                int publicationYear, String bookID, boolean isRestricted, String series) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.ISBN = ISBN;
        this.language = language;
        this.publicationYear = publicationYear;
        this.bookID = bookID;
        this.isRestricted = isRestricted;
        this.series = series;
    }

    // TO DO Getters and setters

    public String getId() {
        return bookID;
    }
}