package org.lemon.study.observer.eventbus;

import java.util.concurrent.Executor;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年05月13日 15:47:00
 */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
