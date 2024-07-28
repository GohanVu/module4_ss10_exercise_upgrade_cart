package com.codegym.exercise_upgrade_cart.repository;

import com.codegym.exercise_upgrade_cart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
}