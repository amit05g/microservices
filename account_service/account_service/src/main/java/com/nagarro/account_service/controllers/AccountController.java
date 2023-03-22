package com.nagarro.account_service.controllers;

import com.nagarro.account_service.entities.Account;
import com.nagarro.account_service.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/getaccount/{customerId}")
    public Account getAccount(@PathVariable String customerId){
        return this.accountService.getAccount(customerId);
    }

    @DeleteMapping("/{customerId}")
    public Account deleteAccount(@PathVariable("customerId")String customerId){
        return this.accountService.deleteAccount(customerId);
    }

    @PutMapping("/deduct/{customerId}")
    public Account withDrawAmount(@RequestParam Double amount, @PathVariable String customerId){
        return this.accountService.withdrawMoney(amount,customerId);
    }

    @PutMapping("/add/{customerId}")
    public Account addAmount(@RequestParam Double amount, @PathVariable("customerId") String customerId){
        return this.accountService.addAmount(amount, customerId);
    }

    @PostMapping("/create")
    public Account createAccount(@RequestBody Account account){
        return this.accountService.createAccount(account);
    }

    @GetMapping("/get-all")
    public ArrayList<Account> getAlAccount(){
        return this.accountService.getAllAccount();
    }
}
