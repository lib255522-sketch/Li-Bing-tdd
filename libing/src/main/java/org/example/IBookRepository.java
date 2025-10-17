package org.example;

import java.util.*;
interface IBookRepository {
    Book findById(String id);
    void save(Book book);
    List<Book> findAll();
}

