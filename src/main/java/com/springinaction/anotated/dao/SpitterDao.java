package com.springinaction.anotated.dao;

import com.springinaction.anotated.domain.Spitter;

import java.util.List;

public interface SpitterDao {

    public void addSpitter(Spitter spitter);

    public Spitter getSpitterById(Long id);

    public List<Spitter> getSpitters();

    public void saveSpitter(Spitter spitter);
}
