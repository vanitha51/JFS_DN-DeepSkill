package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;
    private BookRepository bookRepository;
    private String libraryName;

    public BookService(String libraryName) {
        this.libraryName = libraryName;
        System.out.println("Constructor Injection Executed");
    }
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection Executed");
    }

    public void displayService() {
        System.out.println("Book Service is working...");
        repository.displayRepository();
    }
    public void addBook() {
    	System.out.println("Library Name : " + libraryName);
        System.out.println("Book Service: Processing book...");
        bookRepository.saveBook();
    }
}