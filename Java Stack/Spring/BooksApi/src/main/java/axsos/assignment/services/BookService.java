package axsos.assignment.services;

import java.util.Optional;
import org.springframework.stereotype.Service;
import axsos.assignment.models.BookModel; // ✅ CORRECT
import axsos.assignment.repositories.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // UPDATE method
    public BookModel updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
        Optional<BookModel> optionalBook = Optional.empty();
        if (optionalBook.isPresent()) {
            BookModel book = optionalBook.get();
            book.setTitle(title);
            book.setDescription(desc);
            book.setLanguage(lang);
            book.setNumberOfPages(numOfPages);
            return bookRepository.save(book);
        } else {
            return null; // or throw a custom exception
        }
    }

    // DELETE method
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
