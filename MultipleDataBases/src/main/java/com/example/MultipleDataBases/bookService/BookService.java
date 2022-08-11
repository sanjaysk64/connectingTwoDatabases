package com.example.MultipleDataBases.bookService;

import java.util.List;

import com.example.MultipleDataBases.model.book.Book;
 
public interface BookService {
	public Book saveUser(Book book );
	public List<Book>getAll();
}
