package com.geekster.UserManagementSystem.service;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<User> getAllUser() {
        return userDao.getAllUser();

    }

    public User getUserById(int userId) {
        List<User> list = userDao.getAllUser();
        for(User user : list){
            if(user.getUserId()==userId){
                return user;
            }
        }
        return null;
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void updateUser(int userId, User user) {
        User user1 = getUserById(userId);
        user1.setUsername(user.getUsername());
        user1.setDate(user.getDate());
        user1.setDob(user.getDob());
        user1.setEmail(user.getEmail());
        user1.setPhoneNumber(user.getPhoneNumber());
    }

    public void deleteUser(int userId) {
        User user1 = getUserById(userId);
        userDao.deleteUser(user1);

    }
}
