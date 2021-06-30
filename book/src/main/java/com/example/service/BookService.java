package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Book;
import com.example.repository.BookRepository;


@Service
@Transactional
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	public List<Book> listAllBooks(){
		return bookRepository.findAll();
	}
	
	public void saveAllBook(List<Book> book) {
		for(Book b:book) {
			bookRepository.save(b);
		}
	}
	
	public Book getBook(int book) {
		return bookRepository.findById(book).get();
	}
	
	public List<Book> getBookByTitle(String title){
		List<Book> books = bookRepository.findByTitleContains(title);
		System.out.println(books);
		return books;
	}
}
