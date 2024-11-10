package com.example.Services;

import java.util.List;

import com.example.Data.Entity.User;

public interface IUserService {
    void create(User user);

    List<User> getAll();
}
