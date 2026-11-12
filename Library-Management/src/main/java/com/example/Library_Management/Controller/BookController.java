package com.example.Library_Management.Controller;

import com.example.Library_Management.Entity.Book;
import com.example.Library_Management.Service.BookService;
import com.example.Library_Management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public Book addbook(@RequestBody Book book){
        return bookService.addbook(book);
    }

    @GetMapping("/books")
    public List<Book> GetBook(Book book){
        return bookService.getAllBooks();
    }

    @DeleteMapping("/books/{bookId}")
   public String DeleteBookById(@PathVariable int bookId){
        return bookService.deleteBookByID(bookId);
    }

    @GetMapping("/books/{bookId}")
    public Optional<Book> getBookById(@PathVariable int bookId){
        return bookService.findBookByID(bookId);
    }

    @PutMapping("/books")
    public Book updateBookByID(@RequestBody Book book){
        return bookService.updateBookById(book);
    }
}
