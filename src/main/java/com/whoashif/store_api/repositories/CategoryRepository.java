package com.whoashif.store_api.repositories;

import com.whoashif.store_api.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
