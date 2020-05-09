package org.lemon.study.proxy;

import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月27日 10:36:00
 */
public class Client {

    public static void main(String[] args) {
        String channel = "B2G";

        //将代理生成的文件写到本地 D:\workspace_2020\com\sun\proxy
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // 下面的创建代理对象可以使用工厂模式创建
        FlightOrderService service = (FlightOrderService)Proxy.newProxyInstance(Client.class.getClassLoader(),
            new Class[] {FlightOrderService.class}, new FlightOrderServiceProxyHandler(channel));

        List<FlightInfo> list = service.search("WUH", "PEK", "2020-03-22");
        list.forEach((t) -> System.out.println(t.getFlightNo()));
    }
}
