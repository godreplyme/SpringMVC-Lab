package com.nhv.services.impl;

import com.nhv.pojo.Category;
import com.nhv.repositories.CategoryRepository;
import com.nhv.repositories.impl.CategoryRepositoryImpl;
import com.nhv.services.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository category;

    @Override
    @Transactional
    public List<Category> getCates() {
        return this.category.getCates();
    }
}
