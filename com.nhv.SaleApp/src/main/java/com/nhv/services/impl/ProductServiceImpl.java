/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhv.services.impl;

import com.nhv.pojo.Product;
import com.nhv.services.ProductService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductServiceImpl product;

    @Override
    @Transactional
    public List<Product> getProducts(Map<String, String> params) {
        return this.product.getProducts(params);
    }
}
