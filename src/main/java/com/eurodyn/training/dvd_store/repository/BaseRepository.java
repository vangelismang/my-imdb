package com.eurodyn.training.dvd_store.repository;

import com.eurodyn.training.dvd_store.model.BaseEntity;

import java.util.List;

public interface BaseRepository<E extends BaseEntity> {

    Long create(E entity);

    E findById(Long id);

    List<E> findAll();

    void delete(Long Id);
}
