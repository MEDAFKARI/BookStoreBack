package com.SBS.springbookseller.Controller;


import com.SBS.springbookseller.DAO.entities.Book;
import com.SBS.springbookseller.DAO.entities.PurchaseHistory;
import com.SBS.springbookseller.Service.BookService;
import com.SBS.springbookseller.Service.PurchaseHstryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/purchase")
public class PurchaseHistController {
    @Autowired
    PurchaseHstryService purchaseHstryService;

    @PostMapping
    ResponseEntity<?> savePurchase(@RequestBody PurchaseHistory purchaseHistory){
        return new ResponseEntity<>(purchaseHstryService.savePurchaseHistory(purchaseHistory), HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<?> getAllPurchase(){
        return new ResponseEntity<>(purchaseHstryService.findAllPurchase(), HttpStatus.OK);
    }


    @GetMapping("/user/{username}")
    ResponseEntity<?> getAllPurchase(@PathVariable("username")String username){
        return new ResponseEntity<>(purchaseHstryService.findPurchasedItemByUser(username),HttpStatus.OK);
    }




}
