package com.gmail.reater.last.test.db.repository.dao;

import com.gmail.reater.last.test.db.repository.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMongoRepository extends MongoRepository<Book, Long> {

    List<Book> findByCategory(String category);
    Book findByBookId(long bookId);
}
