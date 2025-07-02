/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhv.repositories.impl;

import com.nhv.pojo.Category;
import com.nhv.repositories.CategoryRepository;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    @Transactional
    public List<Category> getCates() {
        Session s = factory.getObject().getCurrentSession();
        Query q = s.createQuery("from Category", Category.class);
        return q.getResultList();
    }
}
