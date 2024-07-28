package com.codegym.exercise_upgrade_cart.service;

import com.codegym.exercise_upgrade_cart.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    Optional<Product> findById(Long idProduct);
}