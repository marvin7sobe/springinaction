package com.springinaction.anotated.service;

import com.springinaction.anotated.dao.SpitterDao;
import com.springinaction.anotated.domain.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SpitterService {

    @Autowired
    @Qualifier("hibernate-spitter-dao")
    private SpitterDao hibernateSpitterDAO;

    @Autowired
    @Qualifier("jpa-spitter-dao")
    private SpitterDao jpaSpitterDao;

    @PostConstruct
    public void initSpitter(){
//        inserting data using hibernate
        Spitter spitter = new Spitter();
        spitter.setName("my spitter");
        hibernateSpitterDAO.addSpitter(spitter);

//        insertinv data using JPA
        Spitter spitter2 = new Spitter();
        spitter.setName("my spitter2");
        jpaSpitterDao.addSpitter(spitter2);
    }
}
