package com.vg.github_actions.service;

import com.vg.github_actions.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();

    Product findById(Long id);
}
