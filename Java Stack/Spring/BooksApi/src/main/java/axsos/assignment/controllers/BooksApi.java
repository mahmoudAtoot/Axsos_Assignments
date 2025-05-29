package axsos.assignment.controllers;

import org.springframework.web.bind.annotation.*;
import axsos.assignment.models.BookModel;
import axsos.assignment.services.BookService;

@RestController
public class BooksApi {
    private final BookService bookService;

    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }

    // UPDATE method (PUT)
    @PutMapping("/api/books/{id}")
    public BookModel update(
            @PathVariable("id") Long id,
            @RequestParam("title") String title,
            @RequestParam("description") String desc,
            @RequestParam("language") String lang,
            @RequestParam("pages") Integer numOfPages) {
        return bookService.updateBook(id, title, desc, lang, numOfPages);
    }

    // DELETE method

    @DeleteMapping("/api/books/{id}")
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}