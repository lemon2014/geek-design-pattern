package org.lemon.study.observer;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年05月13日 15:28:00
 */
public class MainClass {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        // 注册监听者
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcteteObserverTwo());

        // 通知监听者
        subject.notifyObservers(new Message());
    }
}
