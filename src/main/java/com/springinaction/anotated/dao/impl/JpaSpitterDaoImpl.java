package com.springinaction.anotated.dao.impl;

import com.springinaction.anotated.dao.SpitterDao;
import com.springinaction.anotated.domain.Spitter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Repository("jpa-spitter-dao")
@Transactional
public class JpaSpitterDaoImpl implements SpitterDao {

    @PersistenceContext
    private EntityManager em;

    public void addSpitter(Spitter spitter) {
        em.persist(spitter);
    }

    public Spitter getSpitterById(Long id) {
        return em.find(Spitter.class, id);
    }

    @Override
    public List<Spitter> getSpitters() {
//        stub for now
        return Collections.emptyList();
    }

    public void saveSpitter(Spitter spitter) {
        em.merge(spitter);
    }

}
