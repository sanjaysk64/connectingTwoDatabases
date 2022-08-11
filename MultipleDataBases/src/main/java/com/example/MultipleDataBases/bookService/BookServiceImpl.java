package com.example.MultipleDataBases.bookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MultipleDataBases.bookRepo.BookRepo;
import com.example.MultipleDataBases.model.book.Book;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepo bookRepo;
	@Override
	public List<Book> getAll() {
		return bookRepo.findAll();
  	}

	@Override
	public Book saveUser(Book book) {
 		return  bookRepo.save(book);
	}
}
