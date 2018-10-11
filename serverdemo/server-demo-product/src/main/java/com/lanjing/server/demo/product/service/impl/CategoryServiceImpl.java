package com.lanjing.server.demo.product.service.impl;

import com.lanjing.server.demo.product.dataobject.ProductCategory;
import com.lanjing.server.demo.product.repository.ProductCategoryRepository;
import com.lanjing.server.demo.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryList);
    }
}
