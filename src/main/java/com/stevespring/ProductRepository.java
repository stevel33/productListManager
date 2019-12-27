package com.stevespring;

import org.springframework.data.jpa.repository.JpaRepository;

// purpose of declaring interface is to specify type of domain entity class and type of the ID
public interface ProductRepository extends JpaRepository<Product, Long> {

}
