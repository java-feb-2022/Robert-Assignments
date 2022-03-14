package com.codingdojo.bookClubMany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.bookClubMany.models.Book;
import com.codingdojo.bookClubMany.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;
	
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}
	
	public Book findBookById(Long id) {
		Optional<Book> optBook = bookRepo.findById(id);
		if (optBook.isPresent()) {
			return optBook.get();
		} else {
			return null;
		}
	}
	
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
}
