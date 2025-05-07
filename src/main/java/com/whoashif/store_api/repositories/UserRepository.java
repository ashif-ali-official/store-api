package com.whoashif.store_api.repositories;

import com.whoashif.store_api.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
