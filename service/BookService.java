// // package service;
import interfaces.IBookService;
import your.package.path.model.Book; // Replace 'your.package.path' with the actual package path of the 'Book' class

public class BookService implements IBookService {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.id, book);
    }

    public void removeBook(Book book) {
        books.remove(book.id);
    }

    public List<Book> searchBooks(String keyword) {
        return books.values().stream()
            .filter(b -> b.title.contains(keyword) || b.author.contains(keyword))
            .collect(Collectors.toList());
    }

    public Book getBookById(String id) {
        return books.get(id);
    }
}