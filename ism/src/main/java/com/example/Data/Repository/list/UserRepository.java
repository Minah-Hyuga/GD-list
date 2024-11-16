package com.example.Data.Repository.list;

import java.util.List;

import com.example.Data.Entity.User;
import java.util.ArrayList;

public class UserRepository implements IUserRepository {

    private List<User> userList;

    public UserRepository() {
        this.userList = new ArrayList<>();
    }

    public void add(User user) {
        userList.add(user);
    }

    public List<User> getAll() {
        return new ArrayList<>(userList);
    }

    public User getByIdUser(int idUser) {
        for (User user : userList) {
            if (user.getIdUser() == idUser) {
                return user;
            }
        }
        return null;
    }

    public boolean delete(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getIdUser() == id) {
                userList.remove(i);
                return true;
            }
        }
        return false;
    }

}
