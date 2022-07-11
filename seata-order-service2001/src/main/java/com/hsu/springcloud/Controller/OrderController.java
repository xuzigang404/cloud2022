package com.hsu.springcloud.Controller;

import com.hsu.springcloud.Entity.Result;
import com.hsu.springcloud.Service.OrderService;
import com.hsu.springcloud.Pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public Result create(Order order) {
        orderService.create(order);
        return new Result(200, "订单创建成功!");
    }
}


