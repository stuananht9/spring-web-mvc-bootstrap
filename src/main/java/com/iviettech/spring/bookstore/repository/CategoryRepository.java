package com.iviettech.spring.bookstore.repository;

import com.iviettech.spring.bookstore.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tuananh on 06/08/17.
 */
@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer> {
}
