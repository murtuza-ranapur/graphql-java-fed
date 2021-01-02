package com.graphqlfed.ms.account;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public Account getAccount(String id) {
        Account account = new Account();
        account.setId(id);
        account.setName("Account from account federation");
        return account;
    }
}
