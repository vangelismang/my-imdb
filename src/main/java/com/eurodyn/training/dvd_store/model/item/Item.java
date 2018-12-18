package com.eurodyn.training.dvd_store.model.item;

import com.eurodyn.training.dvd_store.enums.PricingModel;
import com.eurodyn.training.dvd_store.model.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
public class Item extends BaseEntity implements Rentable {

    private BigDecimal unitPrice;

    private PricingModel pricingModel;

    private String title;

    private Instant releaseDate;

    @Override
    public BigDecimal getUnitPrice() {
        return null;
    }

    @Override
    public PricingModel getPricingModel() {
        return null;
    }
}
