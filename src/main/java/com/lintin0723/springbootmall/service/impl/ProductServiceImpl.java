package com.lintin0723.springbootmall.service.impl;

import com.lintin0723.springbootmall.constant.ProductCategory;
import com.lintin0723.springbootmall.dao.ProductDao;
import com.lintin0723.springbootmall.dto.ProductQueryParams;
import com.lintin0723.springbootmall.dto.ProductRequest;
import com.lintin0723.springbootmall.model.Product;
import com.lintin0723.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }

    @Override
    public Integer countProducts(ProductQueryParams productQueryParams) {
        return productDao.countProducts(productQueryParams);
    }
}
