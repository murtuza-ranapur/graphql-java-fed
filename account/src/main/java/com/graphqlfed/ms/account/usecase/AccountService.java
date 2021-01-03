package com.graphqlfed.ms.account.usecase;

import com.graphqlfed.ms.account.entity.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j(topic = "ACCOUNT_SERVICE")
public class AccountService implements GetAccountUsecase {
    private final AccountRepository repository;
    private final AccountMapper mapper;

    @Override
    public Account getAccount(String id) {
        log.info("Fetching Account by id {}", id);
        return repository.findById(id)
                .map(mapper::toModel)
                .orElseThrow(() -> new RuntimeException("No such Entity found"));
    }

    @Override
    public List<Account> getAllAccounts() {
        log.info("Fetching all the accounts");
        return repository.findAll().stream().map(mapper::toModel).collect(Collectors.toList());
    }
}
