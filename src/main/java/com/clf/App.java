package com.clf;

import com.clf.singleton.LazySingleton1;
import com.clf.singleton.LazySingleton2;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

//        LazySingleton1 a = LazySingleton1.getInstance();
//        LazySingleton1 b = LazySingleton1.getInstance();
        LazySingleton2 a = LazySingleton2.getInstance();
        LazySingleton2 b = LazySingleton2.getInstance();
        System.out.println(a == b);
        System.out.println(a.hashCode() + "," + b.hashCode());
    }
}
