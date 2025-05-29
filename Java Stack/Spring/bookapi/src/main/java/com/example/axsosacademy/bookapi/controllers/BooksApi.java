 package com.example.axsosacademy.bookapi.controllers;
import org.springframework.web.bind.annotation.*;
import com.example.axsosacademy.bookapi.services.BookService;
 import com.example.axsosacademy.bookapi.models.Book; // Import the Book class
 import java.util.List;

@RestController
public class BooksApi {
     private final BookService bookService;
     public BooksApi(BookService bookService) {
         this.bookService = bookService;
     }
     
     @GetMapping("/api/books")
     public List<Book> index() {
        return bookService.allBooks();
     }
     
     @GetMapping("/api/books/{id}")
     public Book index1(@PathVariable("id") Long id) {
    	 
        return bookService.findBook(id);
     }
    
     @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
     public Book update(
             @PathVariable("id") Long id, 
             @RequestParam(value="title") String title, 
             @RequestParam(value="description") String desc,      
             @RequestParam(value="language") String lang,
            @RequestParam(value="pages") Integer numOfPages) {
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }

    
}


