package com.example.Library_Management.Service;

import com.example.Library_Management.Entity.Book;
import com.example.Library_Management.Exception.BookNotFoundException;
import com.example.Library_Management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
 private BookRepository bookRepository;

    public Book addbook(Book book){
     return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public String deleteBookByID(int bookId){
        bookRepository.deleteById(bookId);
        return "book Deleted Successfully";
    }

    public Optional<Book>findBookByID(int bookId){
         Optional<Book> book=bookRepository.findById(bookId);
         if(book.isEmpty()){
             throw new BookNotFoundException("Book is not Found");
         }
        return book;


    }

    public Book updateBookById(Book book){
        return bookRepository.save(book);

    }

    }
