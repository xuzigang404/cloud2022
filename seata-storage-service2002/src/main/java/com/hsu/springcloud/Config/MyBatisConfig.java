package com.hsu.springcloud.Config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.hsu.springcloud.Dao"})
public class MyBatisConfig {
}
