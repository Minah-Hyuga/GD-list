package com.example.Data.Repository.list;

import java.util.List;

import com.example.Data.Entity.User;

public interface IUserRepository {
    List<User> getAll();

    void add(User user);

    User getByIdUser(int idUser);

    boolean delete(int idUser);
}
