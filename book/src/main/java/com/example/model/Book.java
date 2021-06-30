package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookdetail")
public class Book {
	
	@Id
	private int bookID;
	@Column
	private String title;
	@Column
	private String authors;
	@Column
	private double average_rating;
	@Column
	private String isbn;
	@Column
	private String language_code;
	@Column
	private int ratings_count;
	@Column
	private int price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookID, String title, String authors, double average_rating, String isbn, String language_code,
			int ratings_count, int price) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.authors = authors;
		this.average_rating = average_rating;
		this.isbn = isbn;
		this.language_code = language_code;
		this.ratings_count = ratings_count;
		this.price = price;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public double getAverage_rating() {
		return average_rating;
	}
	public void setAverage_rating(double average_rating) {
		this.average_rating = average_rating;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getLanguage_code() {
		return language_code;
	}
	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}
	public int getRatings_count() {
		return ratings_count;
	}
	public void setRatings_count(int ratings_count) {
		this.ratings_count = ratings_count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", authors=" + authors + ", average_rating="
				+ average_rating + ", isbn=" + isbn + ", language_code=" + language_code + ", ratings_count="
				+ ratings_count + ", price=" + price + "]";
	}
	
	
	
	
}
