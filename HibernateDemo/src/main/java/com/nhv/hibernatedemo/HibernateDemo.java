/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.nhv.hibernatedemo;

import com.nhv.responsitories.impl.CategoryRepositoryImpl;
import com.nhv.responsitories.impl.ProductRepositoryImpl;
import com.nhv.responsitories.impl.StatisticRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
//        CategoryRepositoryImpl cates = new CategoryRepositoryImpl();
//        cates.getCates().forEach(c->System.out.println(c.getName()));

//        Map<String,String> params = new HashMap<>();
//        params.put("page", "1");
//        params.put("kw", "iPhone");
//        params.put("fromPrice", "30000000");
//        params.put("categoryId", "2");
//        ProductRepositoryImpl pros = new ProductRepositoryImpl();
//        pros.getProducts(params).forEach(p -> System.out.printf("%d - %s - %.1f\n",p.getId(), p.getName(), p.getPrice()));

        StatisticRepositoryImpl s = new StatisticRepositoryImpl();
//        s.statsRevenueByProduct().forEach(o -> System.out.printf("%d - %s: %d\n", o[0], o[1], o[2]));
        s.statsRevenueByTime("MONTH", 2020).forEach(o -> System.out.printf("%d: %d\n", o[0], o[1]));
    }
}
