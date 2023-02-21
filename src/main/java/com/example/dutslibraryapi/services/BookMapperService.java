package com.example.dutslibraryapi.services;

import com.example.dutslibraryapi.dto.book.BookDTO;
import com.example.dutslibraryapi.models.Book;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookMapperService {

    private final ModelMapper modelMapper;

    private final BooksService booksService;

    public BookMapperService(ModelMapper modelMapper, BooksService booksService) {
        this.modelMapper = modelMapper;
        this.booksService = booksService;
    }

    public Book convertBookDTOBook(BookDTO bookDTO){
        return modelMapper.map(bookDTO, Book.class);
    }

    public BookDTO convertBookToBookDTO(Book book){
        return modelMapper.map(book, BookDTO.class);
    }

    public List<BookDTO> convertBooksToBooksDTO(List<Book> books){
        return books.stream().map(this::convertBookToBookDTO).collect(Collectors.toList());
    }

}
