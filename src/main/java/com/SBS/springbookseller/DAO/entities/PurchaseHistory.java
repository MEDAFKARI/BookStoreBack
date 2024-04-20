package com.SBS.springbookseller.DAO.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@Entity
@Table(name = "purchase_history")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    @NonNull
    private Double price;
    @OneToOne
    private Book book;
    private Date purchaseDate;
}
