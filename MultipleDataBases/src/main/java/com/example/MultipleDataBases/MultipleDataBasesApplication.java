package com.example.MultipleDataBases;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MultipleDataBases.bookRepo.BookRepo;
import com.example.MultipleDataBases.model.book.Book;
import com.example.MultipleDataBases.userrepo.UserRepo;
   
@SpringBootApplication
 public class MultipleDataBasesApplication {
	
		public static void main(String[] args) {
		SpringApplication.run(MultipleDataBasesApplication.class, args);
	}

}
