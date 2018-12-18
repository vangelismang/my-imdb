package com.eurodyn.training.dvd_store.model.item;

import com.eurodyn.training.dvd_store.enums.FilmCategory;
import com.eurodyn.training.dvd_store.model.Award;
import com.eurodyn.training.dvd_store.model.BaseEntity;
import com.eurodyn.training.dvd_store.model.person.Actor;
import com.eurodyn.training.dvd_store.model.person.Director;
import lombok.Data;

import java.util.List;

@Data
public class Film extends BaseEntity {

    private FilmCategory category;

    private List<Actor> cast;

    private List<Director> directors;

    private List<Award> awards;
}
