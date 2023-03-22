package com.nagarro.account_service.services;

import com.nagarro.account_service.entities.Account;

import java.util.ArrayList;

public interface AccountService {
    public Account createAccount(Account account);
    public Account getAccount(String customerId);
    public Account withdrawMoney(Double amount, String customerId);
    public Account addAmount(Double amount,String customerId);
    public Account deleteAccount(String userId);
    public ArrayList<Account> getAllAccount();



}
