package com.SBS.springbookseller.Controller;


import com.SBS.springbookseller.DAO.entities.Book;
import com.SBS.springbookseller.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping
    ResponseEntity<?> saveBook(@RequestBody Book book){
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<?> getBooks(@RequestParam(name = "Search", defaultValue ="")String kw,
                               @RequestParam(name = "size" , defaultValue ="2")int size,
                               @RequestParam(name = "page", defaultValue ="0") int page){
        return new ResponseEntity<>(bookService.searchByTitle(kw,size,page), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<?> getBookById(@PathVariable("id") Long id){
        return new ResponseEntity<>(bookService.getBookById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteBook(@PathVariable("id") Long id){
        return new ResponseEntity<>(bookService.deleteBook(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    ResponseEntity<?> updateBook(@PathVariable("id")Long id, @RequestBody Book book){
        book.setId(id);
        return new ResponseEntity<>(bookService.updateBook(book),HttpStatus.OK);
    }






}
