package org.lemon.study.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 官网产品
 *
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月27日 09:38:00
 */
public class B2cFlightOrderService implements FlightOrderService {
    @Override
    public List<FlightInfo> search(String dept, String to, String flightDate) {

        // 调用航司接口查询价格
        List<FlightInfo> res = new ArrayList<>();
        FlightInfo flightInfo = new FlightInfo();
        flightInfo.setFlightNo("3U8633");
        flightInfo.setDept("PEK");
        flightInfo.setArr("WUH");
        flightInfo.setCabin("Y");
        flightInfo.setPrice(232d);
        res.add(flightInfo);
        return res;
    }
}
