package com.graphqlfed.ms.account.usecase;

import com.graphqlfed.ms.account.entity.AccountEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account toModel(AccountEntity accountEntity);
}
