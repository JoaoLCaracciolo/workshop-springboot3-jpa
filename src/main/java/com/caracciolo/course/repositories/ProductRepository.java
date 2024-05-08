package com.caracciolo.course.repositories;

import com.caracciolo.course.entities.Category;
import com.caracciolo.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
