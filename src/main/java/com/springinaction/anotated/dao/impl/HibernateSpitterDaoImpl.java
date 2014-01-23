package com.springinaction.anotated.dao.impl;

import com.springinaction.anotated.dao.SpitterDao;
import com.springinaction.anotated.domain.Spitter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("hibernate-spitter-dao")
@Transactional
public class HibernateSpitterDaoImpl implements SpitterDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addSpitter(Spitter spitter) {
        currentSession().save(spitter);
    }

    public Spitter getSpitterById(Long id) {
        return (Spitter) currentSession().get(Spitter.class, id);
    }

    @Override
    public List<Spitter> getSpitters() {
        return currentSession().createCriteria(Spitter.class).list();
    }

    public void saveSpitter(Spitter spitter) {
        currentSession().merge(spitter);
    }

}
