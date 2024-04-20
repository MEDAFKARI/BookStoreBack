package com.SBS.springbookseller.Service;

import com.SBS.springbookseller.DAO.Repositories.PurchaseHstryRepository;
import com.SBS.springbookseller.DAO.Repositories.UserRepository;
import com.SBS.springbookseller.DAO.entities.PurchaseHistory;
import com.SBS.springbookseller.DAO.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseHstryServiceImpl implements PurchaseHstryService{

    @Autowired
    PurchaseHstryRepository pRepository;

    @Autowired
    UserService userService;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {
        return pRepository.save(purchaseHistory) ;
    }

    @Override
    public List<PurchaseHistory> findPurchasedItemByUser(String user) {
        return pRepository.findAllByUser(userService.findByUsername(user));
    }

    @Override
    public List<PurchaseHistory> findPurchasedItemByUser(User user) {
        return pRepository.findAllByUser(user);
    }

    @Override
    public List<PurchaseHistory> findAllPurchase() {
        return pRepository.findAll();
    }
}
