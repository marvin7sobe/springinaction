package com.springinaction.anotated.dao.impl;

import com.springinaction.anotated.dao.SpitterDao;
import com.springinaction.anotated.domain.Spitter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("jpa-spitter-dao")
@Transactional
public class JpaSpitterDaoImpl implements SpitterDao {

    @PersistenceContext
    private EntityManager em;

    public void addSpitter(Spitter spitter) {
        em.persist(spitter);
    }

    public Spitter getSpitterById(long id) {
        return em.find(Spitter.class, id);
    }

    public void saveSpitter(Spitter spitter) {
        em.merge(spitter);
    }

}
