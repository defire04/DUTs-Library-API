package com.example.dutslibraryapi.constrollers;

import com.example.dutslibraryapi.dto.book.BookDTO;
import com.example.dutslibraryapi.dto.book.BookSearchDTO;
import com.example.dutslibraryapi.models.Book;
import com.example.dutslibraryapi.services.BookMapperService;
import com.example.dutslibraryapi.services.BooksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BooksController {

    private final BooksService booksService;

    private final BookMapperService bookMapperService;

    public BooksController(BooksService booksService, BookMapperService bookMapperService) {
        this.booksService = booksService;
        this.bookMapperService = bookMapperService;
    }

    @GetMapping("/books")
    public List<BookDTO> showAll() {
        return bookMapperService.convertBooksToBooksDTO(booksService.findAll());
    }

    @GetMapping("/title")
    public List<BookDTO> getBooksByTitle(@RequestBody BookSearchDTO bookSearchDTO) {
        return bookMapperService.convertBooksToBooksDTO(booksService.findByTitleContains(bookSearchDTO.getTitle()));
    }

    @GetMapping("/author")
    public List<BookDTO> getBooksByAuthor(@RequestBody BookSearchDTO bookSearchDTO) {
        return bookMapperService.convertBooksToBooksDTO(booksService.findBooksByAuthor(bookSearchDTO.getTitle()));
    }


}
