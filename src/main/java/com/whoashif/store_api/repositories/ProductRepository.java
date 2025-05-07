package com.whoashif.store_api.repositories;

import com.whoashif.store_api.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
