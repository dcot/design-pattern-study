package com.clf.singleton;

//双重检查的懒加载单例，确保线程安全
public class LazySingleton1 {

    private static volatile LazySingleton1 instance;

    private LazySingleton1(){
        if (instance != null) {
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static LazySingleton1 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton1.class) {
                if (instance == null) {
                    return new LazySingleton1();
                }
            }
        }
        return instance;
    }
}
