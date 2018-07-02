package com.jxs.singleton;

/**
 * 单例模式———枚举实现单例
 * 单例模式的最佳实践，它实现简单，并且在面对复杂的序列化或者反射攻击的时候，能够防止实例化多次。
 * */
public class Singleton5 {

}

enum Something {

    SINGLETON;

    private Singleton5 singleton;

    Something() {

        singleton = new Singleton5();
    }

    public Singleton5 getSingleton() {

        return singleton;
    }
}
