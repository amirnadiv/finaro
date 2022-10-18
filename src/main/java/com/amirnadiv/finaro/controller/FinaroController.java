package com.amirnadiv.finaro.controller;


import com.amirnadiv.finaro.dto.Transaction;
import com.amirnadiv.finaro.service.InvoiceService;
import com.amirnadiv.finaro.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class FinaroController {

    @Autowired
    private InvoiceService invoiceService;
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/")
    public String index() {
        return "Finaro Application is Up and Running :-) ";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST,
            produces = "application/json")
    public Transaction submit(@RequestBody Transaction transaction) {
        Transaction newTransaction = transactionService.createTransaction(transaction);
        return newTransaction;
    }

    @PostMapping("/retrieve")
    public Transaction retrieve(@RequestBody Integer transactionId) {
        return transactionService.getTransaction(transactionId);
    }

    @GetMapping("/getAllTransactions")
    public Collection<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }


}