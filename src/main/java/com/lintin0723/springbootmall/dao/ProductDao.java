package com.lintin0723.springbootmall.dao;

import com.lintin0723.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
