package com.clf.singleton;

//和写法1一样
public class LazySingleton2 {
    private static LazySingleton2 instance;

    private LazySingleton2(){}

    static {
        instance = new LazySingleton2();
    }

    public static LazySingleton2 getInstance() {
        return instance;
    }
}
