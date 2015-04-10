package org.mrseasons.coffeetime.java.tdd.service;

import org.mrseasons.coffeetime.java.tdd.User;
import org.mrseasons.coffeetime.java.tdd.UserDao;

/**
 * Created by mrseasons on 1/28/15.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public User insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }
}
