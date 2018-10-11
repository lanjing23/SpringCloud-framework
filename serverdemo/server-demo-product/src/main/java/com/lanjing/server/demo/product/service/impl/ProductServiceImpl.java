package com.lanjing.server.demo.product.service.impl;

import com.lanjing.server.demo.product.dataobject.ProductInfo;
import com.lanjing.server.demo.product.repository.ProductInfoRepository;
import com.lanjing.server.demo.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductInfoRepository productInfoRepository;

    /**
     * 查询所有在架商品列表
     */
    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(0);
    }

    /**
     * 查询商品列表
     *
     * @param productIdList
     * @return
     */
    @Override
    public List<ProductInfo> findList(List<String> productIdList) {
        return productInfoRepository.findByProductIdIn(productIdList);
    }
}
