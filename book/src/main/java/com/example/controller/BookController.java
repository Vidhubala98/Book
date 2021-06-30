package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.service.BookService;

@RestController
@RequestMapping("/")
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("") //localhost:8081/
	public List<Book> listAllBooks(){
		return bookService.listAllBooks();
	}
	
	@PostMapping("/") //http://localhost:8081/
	public void add(@RequestBody List<Book> book) {
		bookService.saveAllBook(book);
	}
	
	@GetMapping("{bookid}") //localhost:8081/14
	public Book getBook(@PathVariable Integer bookid) {
		return bookService.getBook(bookid);
	}
	
	@GetMapping("/search/{term}") //localhost:8081/search/Harry
	public List<Book> getBookByTitle(@PathVariable String term){
		return bookService.getBookByTitle(term);
	}
}
