package org.mrseasons.coffeetime.java.classloader;

import com.test.Member;
import junit.framework.TestCase;

/**
 * Created by mrseasons on 3/4/15.
 */
public class ClassLoaderTest extends TestCase {

    public void test1() {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader.getClass());

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent.getClass());

        Class<Member> clazz = null;
        Class<Member> clazzParent = null;

        new Member("a", 1);

        try {
            clazz = (Class<Member>) parent.loadClass("org.mrseasons.coffeetime.java.tdd.bean.Price");
            clazzParent = (Class<Member>) parent.loadClass("com.test.Member");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(clazz);
        System.out.println(clazzParent);

    }
//
//    public void test2() throws Exception {
//        URL[] urls = new URL[]{new URL("file:libs/test.jar")};
//        System.out.println(urls[0].getFile());
//
//        URLClassLoader loader1 = new URLClassLoader(urls);
//        Class<Member> clazz1 = (Class<Member>) loader1.loadClass("com.test.Member");
//        Member member1 = clazz1.newInstance();
//
//        URLClassLoader loader2 = new URLClassLoader(urls);
//        Class<Member> clazz2 = (Class<Member>) loader2.loadClass("com.test.Member");
//        Member member2 = clazz2.newInstance();
//
//        System.out.println(loader1);
//        System.out.println(loader2);
//        System.out.println(member1.getClass().getClassLoader().equals(member2.getClass().getClassLoader()));
//
//        member1 = member2;
//    }
//
//    public void test3() throws Exception {
//        URL[] urls = new URL[]{new URL("file:libs/test.jar")};
//        System.out.println(urls[0].getFile());
//
//        ClassLoader classLoader = new ClassPathLoader(new ClassPath());
//
//        URLClassLoader loader1 = new URLClassLoader(urls, classLoader);
//        Class<Member> clazz1 = (Class<Member>) loader1.loadClass("com.test.Member");
//        Member member1 = clazz1.newInstance();
//
//        classLoader = new ClassPathLoader(new ClassPath());
//        URL[] urls2 = new URL[]{new URL("file:libs/test2.jar")};
//        URLClassLoader loader2 = new URLClassLoader(urls2, classLoader);
//        Class<Member> clazz2 = (Class<Member>) loader2.loadClass("com.test.Member");
//        Member member2 = clazz2.newInstance();
//
//        System.out.println(loader1);
//        System.out.println(loader2);
//        System.out.println(member1.getClass().getClassLoader().equals(member2.getClass().getClassLoader()));
//        System.out.println(loader1.getParent());
//        System.out.println(loader2.getParent());
//        member1 = member2;
//    }
//
//    public void test4() throws Exception {
//        URL[] urls = new URL[]{new URL("file:libs/subsub.jar")};
//        ClassLoader classLoader = new ClassPathLoader(new ClassPath());
//
//        URLClassLoader loader1 = new URLClassLoader(urls, classLoader);
//        Class<?> clazz1 = loader1.loadClass("com.test.SubSub");
//        Object subsub = clazz1.newInstance();
//
//        URL[] urls2 = new URL[]{new URL("file:libs/sub.jar")};
//        URLClassLoader loader2 = new URLClassLoader(urls2, classLoader);
//        Class<Member> clazz2 = (Class<Member>) loader2.loadClass("com.test.SubSub");
//        Object subsub2 = clazz1.newInstance();
//
//        System.out.println(loader1);
//        System.out.println(loader2);
//        System.out.println(subsub.getClass().getClassLoader().equals(subsub2.getClass().getClassLoader()));
//        System.out.println(loader1.getParent());
//        System.out.println(loader2.getParent());
//        subsub = subsub2;
//    }
}
