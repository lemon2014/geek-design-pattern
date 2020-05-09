package org.lemon.study.proxy;

import java.util.List;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月27日 09:33:00
 */
public interface FlightOrderService {

    /**
     * 航班询价
     *
     * @param dept
     * @param to
     * @param flightDate
     * @return
     */
    List<FlightInfo> search(String dept, String to, String flightDate);

}
