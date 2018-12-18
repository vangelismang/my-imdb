package com.eurodyn.training.dvd_store.model;

import com.eurodyn.training.dvd_store.model.item.Item;
import com.eurodyn.training.dvd_store.model.person.Customer;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
public class Order extends BaseEntity {

    private Customer customer;

    private Item item;

    private Instant dateOfOrder;

    private Instant dateOfReturn;

    private BigDecimal currentAmount;
}
