package com.hsu.springcloud.Service;

import org.springframework.stereotype.Service;

@Service
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}


