package org.mrseasons.coffeetime.java.tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mrseasons.coffeetime.java.tdd.bean.User;
import org.mrseasons.coffeetime.java.tdd.dao.UserDao;
import org.mrseasons.coffeetime.java.tdd.service.UserService;
import org.mrseasons.coffeetime.java.tdd.service.UserServiceImpl;

/**
 * Created by mrseasons on 1/28/15.
 */
public class UserServiceTest {

    private UserService userService;

    @Test
    public void testInsertUser() {
        //Pojo object
        User user = new User();
        user.setId("1");
        user.setName("Jack");
        user.setAge(20);

        //mock
        UserDao userDao = Mockito.mock(UserDao.class);
        Mockito.when(userDao.insertUser(user)).thenReturn(user);

        userService = new UserServiceImpl(userDao);
        User userResult = userService.insertUser(user);
        Assert.assertEquals(user, userResult);

    }
}
