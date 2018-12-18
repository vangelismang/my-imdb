package com.eurodyn.training.dvd_store.model.person;

import com.eurodyn.training.dvd_store.model.Award;
import lombok.Data;

import java.util.List;

@Data
public abstract class FilmPerson extends Person {

    private List<Award> awards;
}
