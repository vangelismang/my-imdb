package com.eurodyn.training.dvd_store.model;

import com.eurodyn.training.dvd_store.enums.AwardCategory;
import lombok.Data;

@Data
public class Award extends BaseEntity {

    private AwardCategory category;

    private String organization;
}
