
package com.hsu.springcloud.Service;

import com.hsu.springcloud.Pojo.Order;


public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}


