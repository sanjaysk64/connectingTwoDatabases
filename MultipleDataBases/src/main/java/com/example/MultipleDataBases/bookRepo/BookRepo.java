package com.example.MultipleDataBases.bookRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.MultipleDataBases.model.book.Book;

 @Repository
public interface BookRepo  extends JpaRepository<Book, Integer>{

}
