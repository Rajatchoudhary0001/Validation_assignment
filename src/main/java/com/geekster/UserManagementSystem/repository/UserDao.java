package com.geekster.UserManagementSystem.repository;

import com.geekster.UserManagementSystem.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDao {
    List<User> userList= new ArrayList<>();
    public List<User> getAllUser() {
        return this.userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void deleteUser(User user) {
        userList.remove(user);
    }
}
