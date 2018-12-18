package com.eurodyn.training.dvd_store.model.item;

import com.eurodyn.training.dvd_store.enums.PricingModel;

import java.math.BigDecimal;

public interface Rentable {

    BigDecimal getUnitPrice();

    PricingModel getPricingModel();

}
