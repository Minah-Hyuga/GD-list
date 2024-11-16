package com.example.Services;

import java.util.List;

import com.example.Data.Entity.User;
import com.example.Data.Repository.list.IUserRepository;

public class UserService implements IUserService {
    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(User user) {
        userRepository.add(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAll();
    }

    @Override
    public List<User> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

}