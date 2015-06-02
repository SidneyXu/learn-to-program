package org.mrseasons.coffeetime.kotlin;

import hello.HelloPackage;

public class JavaHello {
  public static String JavaHelloString = "Hello from Java!";

  public static String getHelloStringFromKotlin() {
    return HelloPackage.getKotlinHelloString();
  }

  public static void main(String[] args) {
    System.out.println(getHelloStringFromKotlin());
    System.out.println(HelloPackage.getHelloStringFromJava());
  }
}
