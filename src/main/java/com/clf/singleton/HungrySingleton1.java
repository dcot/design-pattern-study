package com.clf.singleton;

//饿汉式1
public class HungrySingleton1 {

    private static final HungrySingleton1 instance = new HungrySingleton1();

    private HungrySingleton1(){
        if (instance != null) {
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static HungrySingleton1 getInstance() {
        return instance;
    }
}
