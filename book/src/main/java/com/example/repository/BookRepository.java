package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Book;
import java.lang.String;

public interface BookRepository extends JpaRepository<Book, Integer> {
		
		List<Book> findByTitleContains(String title);
}
