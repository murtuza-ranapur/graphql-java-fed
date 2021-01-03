package com.graphqlfed.ms.account.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "account")
public class AccountEntity {
    @Id
    private String id;

    private String name;
}
