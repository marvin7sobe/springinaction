package com.springinaction.anotated.dao;

import com.springinaction.anotated.domain.Spitter;

public interface SpitterDao {

    public void addSpitter(Spitter spitter);

    public Spitter getSpitterById(Long id);

    public void saveSpitter(Spitter spitter);
}
