package com.iviettech.spring.bookstore.repository;

import com.iviettech.spring.bookstore.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tuananh on 06/08/17.
 */
@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer>{
    List<BookEntity> findByNameContainingOrAuthorContaining(String name, String author);
}
