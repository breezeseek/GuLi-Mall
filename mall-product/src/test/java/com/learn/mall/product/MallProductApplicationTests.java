package com.learn.mall.product;

import com.learn.mall.product.entity.BrandEntity;
import com.learn.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MallProductApplicationTests {

    @Resource
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity byId = brandService.getById(1L);
        System.out.println(byId);
    }

}
