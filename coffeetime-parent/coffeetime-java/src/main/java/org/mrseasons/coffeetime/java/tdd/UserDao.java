package org.mrseasons.coffeetime.java.tdd;

/**
 * Created by mrseasons on 1/28/15.
 */
public interface UserDao {
    User insertUser(User user);

    void deleteUser(User user);
}
