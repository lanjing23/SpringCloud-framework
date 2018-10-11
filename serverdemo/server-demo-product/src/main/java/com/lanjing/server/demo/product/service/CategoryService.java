package com.lanjing.server.demo.product.service;

import com.lanjing.server.demo.product.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);
}
