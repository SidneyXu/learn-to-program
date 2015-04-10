package org.mrseasons.coffeetime.java.tdd.dao;

import org.mrseasons.coffeetime.java.tdd.User;

/**
 * Created by mrseasons on 1/28/15.
 */
public interface UserDao {
    User insertUser(User user);

    void deleteUser(User user);
}
