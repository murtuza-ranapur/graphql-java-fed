package com.graphqlfed.ms.account.usecase;

import java.util.List;

public interface GetAccountUsecase {
    Account getAccount(String id);
    List<Account> getAllAccounts();
}
