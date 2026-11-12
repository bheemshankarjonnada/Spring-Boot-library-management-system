package com.example.Library_Management.Exception;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(BookNotFoundException.class)
     public String handleBookNotFound(BookNotFoundException ex){
    System.out.println("Book is not found");
return ex.getMessage();
    }

}
