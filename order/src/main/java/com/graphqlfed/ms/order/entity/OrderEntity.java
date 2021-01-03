package com.graphqlfed.ms.order.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_tab")
@Getter
@Setter
public class OrderEntity {
    @Id
    private String id;

    private String item;

    @Column(name = "account_id")
    private String accountId;
}
