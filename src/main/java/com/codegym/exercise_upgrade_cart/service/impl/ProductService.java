package com.codegym.exercise_upgrade_cart.service.impl;

import com.codegym.exercise_upgrade_cart.model.Product;
import com.codegym.exercise_upgrade_cart.repository.IProductRepository;
import com.codegym.exercise_upgrade_cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long idProduct) {
        return productRepository.findById(idProduct);
    }
}