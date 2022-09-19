package com.clf.singleton;

//和写法1一样
public class HungrySingleton2 {
    private static HungrySingleton2 instance;

    private HungrySingleton2() throws IllegalAccessException {
        if (instance != null) {
            throw new IllegalAccessException();
        }
    }

    static {
        try {
            instance = new HungrySingleton2();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static HungrySingleton2 getInstance() {
        return instance;
    }
}
