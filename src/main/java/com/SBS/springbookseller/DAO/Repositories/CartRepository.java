package com.SBS.springbookseller.DAO.Repositories;

import com.SBS.springbookseller.DAO.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUserId(Long userId);
}
