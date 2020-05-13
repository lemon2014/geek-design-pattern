package org.lemon.study.observer;

/**
 *
 * 观察者
 *
 *
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年05月13日 15:20:00
 */
public interface Observer {

    /**
     * 处理消息
     *
     * @param message
     */
    void headle(Message message);
}
