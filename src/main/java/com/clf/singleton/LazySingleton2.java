package com.clf.singleton;

//通过静态内部类使用时才加载和JVM类加载天然线程安全的机制实现单例
public class LazySingleton2 {

    //private static volatile LazySingleton2 instance;

    private LazySingleton2(){}

    private static class Instance{
        private static final LazySingleton2 instance = new LazySingleton2();
    }
    public static LazySingleton2 getInstance() {
        return Instance.instance;
    }
}
