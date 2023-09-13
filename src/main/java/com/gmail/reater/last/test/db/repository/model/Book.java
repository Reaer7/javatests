package com.gmail.reater.last.test.db.repository.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
@Data
public class Book {

    @Id
    private String id;
    private long bookId;
    private String isbnNumber;
    private String category;
    private String bookName;
}
