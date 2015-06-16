package org.mrseasons.coffeetime.java.reflect;

import junit.framework.TestCase;
import org.mrseasons.coffeetime.java.reflect.model.User;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * Created by mrseasons on 2015/06/16.
 */
public class ReflectTest extends TestCase {

    public void testCore() {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType methodType = MethodType.methodType(String.class, String.class);
        try {
            User user = new User("Peter", 20);
            MethodHandle methodHandle = lookup.findVirtual(User.class, "echo", methodType);
            String result = (String) methodHandle.invokeExact(user, "abc");
            
            System.out.println(result);

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

