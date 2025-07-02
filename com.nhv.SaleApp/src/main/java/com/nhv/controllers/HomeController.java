package com.nhv.controllers;


import com.nhv.pojo.Category;
import com.nhv.services.CategoryService;
import com.nhv.services.impl.CategoryServiceImpl;
import com.nhv.services.ProductService;
import jakarta.persistence.Query;
import java.util.Map;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
@Controller
@Transactional
public class HomeController {
    @Autowired
    private CategoryService cate;
    private ProductService product;
    @RequestMapping(value = "/")
    public String index(Model model, Map<String, String> params){
        model.addAttribute("categories", this.cate.getCates());
        model.addAttribute("products", this.product.getProducts(params));
        return "index";
    }
}
