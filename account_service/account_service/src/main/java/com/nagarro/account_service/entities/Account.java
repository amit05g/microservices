package com.nagarro.account_service.entities;

public class Account {
    private String accountId;
//    private String accountHolderfirstName;
//    private String getAccountHolderlastName;
    private double remainingBalance;
    private String customerId;

    public Account(String accountId, /*String accountHolderfirstName,
                   String getAccountHolderlastName,*/
                   double remainingBalance, String customerId) {

        this.accountId = accountId;
//        this.accountHolderfirstName = accountHolderfirstName;
//        this.getAccountHolderlastName = getAccountHolderlastName;
        this.remainingBalance = remainingBalance;
        this.customerId = customerId;
    }


    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

//    public String getAccountHolderfirstName() {
//        return accountHolderfirstName;
//    }
//
//    public void setAccountHolderfirstName(String accountHolderfirstName) {
//        this.accountHolderfirstName = accountHolderfirstName;
//    }
//
//    public String getGetAccountHolderlastName() {
//        return getAccountHolderlastName;
//    }
//
//    public void setGetAccountHolderlastName(String getAccountHolderlastName) {
//        this.getAccountHolderlastName = getAccountHolderlastName;
//    }

    public double getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(double remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
