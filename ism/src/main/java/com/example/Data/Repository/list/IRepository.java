package com.example.Data.Repository.list;

import java.util.List;

public interface IRepository<T> {
    void add(T value);

    List<T> selectAll();
}
