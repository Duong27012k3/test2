package org.ntt.emoi.app.repositories;


import org.ntt.emoi.app.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
