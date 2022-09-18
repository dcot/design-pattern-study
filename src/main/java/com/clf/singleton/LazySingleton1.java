package com.clf.singleton;

public class LazySingleton1 {

    private static final LazySingleton1 instance = new LazySingleton1();

    private LazySingleton1(){}

    public static LazySingleton1 getInstance() {
        return instance;
    }
}
