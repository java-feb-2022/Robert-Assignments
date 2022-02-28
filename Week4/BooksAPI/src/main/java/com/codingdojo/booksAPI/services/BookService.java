package com.codingdojo.booksAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.booksAPI.models.Book;
import com.codingdojo.booksAPI.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepo;
	
	
	public BookService(BookRepository bookRepository) { this.bookRepo = bookRepository; }
	
	public List<Book> allBooks() { return bookRepo.findAll(); }
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}
		else {
			return null;
		}
	}
	
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
}