package com.peiwen.tech.spring5webapp.repositories;

import com.peiwen.tech.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{

}
