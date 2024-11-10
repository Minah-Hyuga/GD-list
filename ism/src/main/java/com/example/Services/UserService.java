package com.example.Services;

import java.util.List;

import com.example.Data.Entity.User;
import com.example.Data.Repository.list.IUserRepository;
import com.example.Data.Repository.list.UserRepository;

public class UserService implements IUserService {
    // private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        // this.userRepository = userRepository;
    }

    @Override
    public void create(User user) {
        UserRepository.add(user);
        System.out.println("User ajouter avec succès");
    }

    @Override
    public List<User> getAll() {
        return UserRepository.getAll();
    }

}