package com.example.dutslibraryapi.services;

import com.example.dutslibraryapi.models.Book;
import com.example.dutslibraryapi.repositories.BooksRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class BooksService {
    private final BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> findAll(){
        return booksRepository.findAll();
    }

    public List<Book> findByTitleContains(String title){
        return booksRepository.findByTitleContains(title);
    }

    public List<Book> findBooksByAuthorContains(String author){
        return booksRepository.findBooksByAuthorContains(author);
    }

    public List<Book> findBooksByLanguage(String language) {
        return booksRepository.findBooksByLanguage(language);
    }

    public List<Book> findBooksByClassification(String classification) {
        return booksRepository.findBooksByClassification(classification);
    }

    public List<Book> findBooksBySubCategory(String subCategory) {
        return booksRepository.findBooksBySubCategory(subCategory);
    }

    public List<Book> findBooksByGlobalCategory(String globalCategory){
        return booksRepository.findBooksByGlobalCategory(globalCategory);
    }
}
