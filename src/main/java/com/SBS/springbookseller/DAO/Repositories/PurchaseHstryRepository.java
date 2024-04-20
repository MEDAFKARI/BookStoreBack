package com.SBS.springbookseller.DAO.Repositories;

import com.SBS.springbookseller.DAO.entities.Book;
import com.SBS.springbookseller.DAO.entities.PurchaseHistory;
import com.SBS.springbookseller.DAO.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PurchaseHstryRepository extends JpaRepository<PurchaseHistory, Long> {
        List<PurchaseHistory> findAllByUser(User user);
        PurchaseHistory findByBook(Book book);
}