package org.mrseasons.coffeetime.java.tdd.service;

import org.mrseasons.coffeetime.java.tdd.bean.User;

/**
 * Created by mrseasons on 1/28/15.
 */
public interface UserService {
    User insertUser(User user);

    void deleteUser(User user);
}
