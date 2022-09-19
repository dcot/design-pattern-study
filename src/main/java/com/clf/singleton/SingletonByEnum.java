package com.clf.singleton;

//枚举是天然的懒加载+线程安全+防反射+防反序列化单例模式
public enum SingletonByEnum {
    INSTANCE;

}
