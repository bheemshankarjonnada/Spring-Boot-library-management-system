package com.example.Library_Management.repository;

import com.example.Library_Management.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
