package org.lemon.study.observer;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年05月13日 15:27:00
 */
public class ConcteteObserverTwo implements Observer{
    @Override
    public void headle(Message message) {
        System.out.println("ConcreteObserverTwo is notified");
    }
}
