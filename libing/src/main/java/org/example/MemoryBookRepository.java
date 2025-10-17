package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryBookRepository implements IBookRepository {
    private final Map<String, Book> books = new HashMap<>();

    @Override
    public Book findById(String id) {
        return books.get(id);
    }

    @Override
    public void save(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
}
