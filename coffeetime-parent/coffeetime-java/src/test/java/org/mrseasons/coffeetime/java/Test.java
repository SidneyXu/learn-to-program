package org.mrseasons.coffeetime.java;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by mrseasons on 15-2-4.
 */
public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException {
//        final ExecutorService service= Executors.newFixedThreadPool(3);
//
//        for(int i=0;i<10;i++) {
//            final int j=i;
//            service.execute(new Runnable() {
//                @Override
//                public void run() {
//                    new Thread(() -> {
//                        long r=new Random().nextInt(10000);
//                        try {
//                            Thread.sleep(r);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println("in:"+j+"-"+Thread.currentThread().getName());
//                    }).start();
//
//                    long r=new Random().nextInt(10000);
//                    try {
//                        Thread.sleep(r);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("finish:"+j+"-"+Thread.currentThread().getName());
//                }
//            });
//        }


        String str = "android\\u7248\\u672c\\u5347\\u7ea7\\u6807\\u9898";
        str = str.replace("\\", "");
        String[] arr = str.split("u");
        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            try {
                int hexVal = Integer.parseInt(s, 16);
                builder.append((char) hexVal);
            } catch (NumberFormatException e) {
                builder.append(s);
            }
        }
        System.out.println(builder.toString());

    }

}
