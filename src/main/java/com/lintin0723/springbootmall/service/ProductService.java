package com.lintin0723.springbootmall.service;

import com.lintin0723.springbootmall.dto.ProductRequest;
import com.lintin0723.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
