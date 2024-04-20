package com.SBS.springbookseller.Service;

import com.SBS.springbookseller.DAO.Repositories.BookRepository;
import com.SBS.springbookseller.DAO.Repositories.PurchaseHstryRepository;
import com.SBS.springbookseller.DAO.entities.Book;
import com.SBS.springbookseller.DAO.entities.PurchaseHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PurchaseHstryRepository purchaseHstryRepository;

    @Override
    public Page<Book> searchByTitle(String word, int size, int page) {

        return bookRepository.findByTitleContaining(word, PageRequest.of(page, size));
    }

    @Override
    public Book getBookById(Long Id) {
        return bookRepository.findById(Id).orElse(null);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book deleteBook(Book book) {
        Book book1 = book;
        bookRepository.delete(book);
        return book1;
    }

    @Override
    public Book deleteBook(Long IdBook) {
        Book book1 = bookRepository.findById(IdBook).orElse(null);
        PurchaseHistory purchaseHistory = purchaseHstryRepository.findByBook(book1);
        if (purchaseHistory != null) {
            purchaseHistory.setBook(null);
        }
        bookRepository.deleteById(IdBook);
        return book1;
    }
    @Override
    public List<Book> getAllBooksByAuthor(String Author) {
        return bookRepository.findAllByAuthor(Author);
    }
}
