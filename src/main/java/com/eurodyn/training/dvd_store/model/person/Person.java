package com.eurodyn.training.dvd_store.model.person;

import com.eurodyn.training.dvd_store.model.BaseEntity;
import lombok.Data;

import java.time.Instant;

@Data
public abstract class Person extends BaseEntity {

    private String name;

    private String surname;

    private Instant dateOfBirth;
}
