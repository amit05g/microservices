package com.nagarro.account_service.services;

import com.nagarro.account_service.entities.Account;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class AccountServiceImplementation implements AccountService{
    ArrayList<Account> accountList = new ArrayList<Account>();

    @Override
    public Account createAccount(Account newAccount) {
        if(accountList.size()==0){
            accountList.add(newAccount);
            return newAccount;
        }
        boolean isPresent = false;
        for(Account acc: accountList){
            if (acc.getAccountId().equals(newAccount.getAccountId())){
                isPresent = true;
                return null;
            }
        }
        if(!isPresent){
            accountList.add(newAccount);
            return newAccount;
        }
        return null;
    }

    @Override
    public Account getAccount(String customerId) {
        return accountList.stream().filter(account -> account.getCustomerId().equals(customerId)).findAny().orElseThrow();
    }

    @Override
    public Account withdrawMoney(Double amount, String customerId) {

        Account account1 = accountList.stream().filter(account -> account.getCustomerId().equals(customerId)).findAny().orElseThrow();
        account1.setRemainingBalance(account1.getRemainingBalance()-amount);
        return account1;
        //return null;
    }

    @Override
    public Account addAmount(Double amount,String customerId) {
        Account account1 = accountList.stream().filter(account -> account.getCustomerId().equals(customerId)).findAny().orElseThrow();
        System.out.println(account1);
        account1.setRemainingBalance(account1.getRemainingBalance()+amount);
        return account1;
        //return null;
    }

    @Override
    public Account deleteAccount(String customerId) {
        Account account = accountList.stream().filter(customer -> customer.getCustomerId().equals(customerId)).findAny().orElseThrow();
        accountList.remove(account);
        return account;
        //return null;
    }

    @Override
    public ArrayList<Account> getAllAccount() {
        return accountList;
    }
}
