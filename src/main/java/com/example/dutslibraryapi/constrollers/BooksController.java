package com.example.dutslibraryapi.constrollers;

import com.example.dutslibraryapi.models.Book;
import com.example.dutslibraryapi.services.BooksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("books")
    public List<Book> showAll(){
        return booksService.findAll();
    }
}
