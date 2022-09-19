package com.clf;

import com.clf.singleton.HungrySingleton2;
import com.clf.singleton.SingletonByEnum;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

//        LazySingleton1 a = LazySingleton1.getInstance();
//        LazySingleton1 b = LazySingleton1.getInstance();
        HungrySingleton2 a = HungrySingleton2.getInstance();
        HungrySingleton2 b = HungrySingleton2.getInstance();
        System.out.println(a == b);
        System.out.println(a.hashCode() + "," + b.hashCode());


    }
}
