package com.lanjing.server.demo.product.repository;

import com.lanjing.server.demo.product.ServerDemoProductApplicationTests;
import com.lanjing.server.demo.product.dataobject.ProductCategory;
import com.netflix.ribbon.proxy.annotation.Content;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Component
@Slf4j
public class ProductCategoryRepositoryTest extends ServerDemoProductApplicationTests {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11, 22));

        log.info("find datas {} ", list);
        Assert.assertTrue(list.size() >= 0);
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("电脑");
        productCategory.setCategoryType(3);

        ProductCategory result = productCategoryRepository.save((productCategory));

        log.info("save result = {}", result);

        Assert.assertNotNull(result);
    }
}