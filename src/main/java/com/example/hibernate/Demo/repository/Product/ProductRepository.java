package com.example.hibernate.Demo.repository.Product;

import com.example.hibernate.Demo.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
