package org.lemon.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月27日 09:43:00
 */
public class FlightOrderServiceProxyHandler implements InvocationHandler {

    private final static String CHANNEL_B2C = "B2C";

    private String channel;

    public FlightOrderServiceProxyHandler(String channel) {
        this.channel = channel;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;

        // 前置操作

        // 如果找到本地的实现类,就走本地,否则就调用远程实现
        if (CHANNEL_B2C.equals(channel)) {
            result = method.invoke(new B2cFlightOrderService(), args);

        } else {

            // 模拟RPC调用
            List<FlightInfo> res = new ArrayList<>();
            FlightInfo flightInfo = new FlightInfo();
            flightInfo.setFlightNo("MU8633");
            flightInfo.setDept("PEK");
            flightInfo.setArr("WUH");
            flightInfo.setCabin("Y");
            flightInfo.setPrice(232d);
            res.add(flightInfo);
            result = res;
        }

        // 后置操作
        return result;
    }
}
