package com.spring.demo.Controller;

import com.spring.demo.Service.BookService;
import com.spring.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController
{
    @Autowired
    private BookService bookService;

    @GetMapping("/{bookId}")
    public Book getBook(@PathVariable Long bookId){
        return bookService.getBook(bookId);
    }

    // create a member
    @PostMapping
    public Book addBook(@RequestBody  Book book){
        return bookService.addBook(book);
    }

    @PutMapping("/{bookId}")
    public Book updateBook(@PathVariable Long bookId,@RequestBody Book book){
        return bookService.updateBook(bookId,book);
    }

}
