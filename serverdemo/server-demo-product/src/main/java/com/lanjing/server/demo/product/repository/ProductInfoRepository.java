package com.lanjing.server.demo.product.repository;

import com.lanjing.server.demo.product.dataobject.ProductInfo;
import com.lanjing.server.demo.product.vo.ProductInfoVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 依据商品编号，获取所有商品信息
     * @param productIdList
     * @return
     */
    List<ProductInfo> findByProductIdIn(List<String > productIdList);

    /**
     * 依据商品状态，获取商品信息（0上架，1下架）
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
