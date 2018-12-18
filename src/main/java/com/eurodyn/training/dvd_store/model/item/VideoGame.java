package com.eurodyn.training.dvd_store.model.item;

import com.eurodyn.training.dvd_store.enums.PricingModel;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class VideoGame extends Item {

    @Override
    public BigDecimal getUnitPrice() {
        return null;
    }

    @Override
    public PricingModel getPricingModel() {
        return null;
    }
}
