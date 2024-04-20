package com.SBS.springbookseller.Service;

import com.SBS.springbookseller.DAO.entities.PurchaseHistory;
import com.SBS.springbookseller.DAO.entities.User;

import java.util.List;

public interface PurchaseHstryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<PurchaseHistory> findPurchasedItemByUser(String user);
    List<PurchaseHistory> findPurchasedItemByUser(User user);
    List<PurchaseHistory> findAllPurchase();

}
