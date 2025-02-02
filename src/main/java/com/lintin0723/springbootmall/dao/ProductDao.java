package com.lintin0723.springbootmall.dao;

import com.lintin0723.springbootmall.dto.ProductRequest;
import com.lintin0723.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
