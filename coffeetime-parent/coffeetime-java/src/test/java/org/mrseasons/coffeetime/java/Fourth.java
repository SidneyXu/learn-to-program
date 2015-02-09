package org.mrseasons.coffeetime.java;

import java.util.Comparator;

/**
 * Created by mrseasons on 12/10/14.
 */
public class Fourth {

    public void testCore() {
        Runnable r = () -> System.out.println("abc");

        Comparator<Integer> com = (x, y) -> (x < y) ? -1 : (x > y ? 1 : 0);

    }

    //build under 40
//    // 接口默认方法
//    interface Queue {
//        Message read();
//
//        void delete(Message message);
//
//        void deleteAll default {
//            Message message;
//            while ((message = read()) != null) {
//                delete(message);
//            }
//        }
//    }
//
//    class Message {
//    }

// 复写父接口默认方法
// interface BatchQueue extends Queue {
// void setBatchSize(int batchSize);
// void deleteAll() default {
// setBatchSize(100);
// Queue.super.deleteAll();
// }
// }
// 取消继承的默认方法，所有FastQueue必须实现deleteAll()
// interface FastQueue extends Queue {
// void deleteAll();
// }
}
