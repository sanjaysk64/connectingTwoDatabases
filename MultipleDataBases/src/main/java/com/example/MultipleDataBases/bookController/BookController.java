package com.example.MultipleDataBases.bookController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MultipleDataBases.bookService.BookService;
import com.example.MultipleDataBases.model.book.Book;
 
@RestController
public class BookController {
	@Autowired
	BookService bookService;
	
	@PostMapping("savebook")
	public Book saveUser(@RequestBody Book book) {
		return bookService.saveUser(book);
	}
	
	@GetMapping("getAllbooks")
	public List<Book> getAll() {
		return bookService.getAll();
	}

}
