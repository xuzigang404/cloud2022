package com.hsu.springcloud.Controller;


import com.hsu.springcloud.Entity.Result;
import com.hsu.springcloud.Service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public Result decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new Result(200,"扣减库存成功！");
    }
}


