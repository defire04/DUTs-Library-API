package com.example.dutslibraryapi.repositories;

import com.example.dutslibraryapi.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitleContains(String title);

    List<Book> findBooksByAuthorContains(String author);

    List<Book> findBooksByLanguage(String language);

    List<Book> findBooksByClassification(String classification);

    List<Book> findBooksBySubCategory(String subCategory);

    List<Book> findBooksByGlobalCategory(String globalCategory);
}
