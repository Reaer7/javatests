package com.gmail.reater.last.test.db.runner;

import com.gmail.reater.last.test.db.repository.dao.BookMongoRepository;
import com.gmail.reater.last.test.db.repository.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@RequiredArgsConstructor
public class TimeMongoTestRunner implements CommandLineRunner {

    private final BookMongoRepository bookMongoRepository;

    @Override
    public void run(final String... args) {
        final LocalDateTime start = LocalDateTime.now();
        for (long index = 0; index < 100_000; index++) {
            Book book = new Book();
            book.setCategory("category");
            book.setBookId(index);
            book.setBookName("bookName");
            book.setIsbnNumber("isbnNumber");
            bookMongoRepository.save(book);
        }
        System.out.println("Mongo\ndelta = " + (LocalDateTime.now().minusNanos(start.toEpochSecond(ZoneOffset.UTC))) + "nanos");
    }
}
