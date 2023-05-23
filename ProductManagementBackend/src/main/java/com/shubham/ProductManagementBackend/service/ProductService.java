package com.shubham.ProductManagementBackend.service;

import com.shubham.ProductManagementBackend.beans.Product;

import java.util.List;

public interface ProductService {
    List<Product> allProducts();

    Product getById(Integer pid);

    Product insertNewProduct(Product prod);

    Product changeProduct(Product prod);

    Boolean removeProduct(Integer pid);
}
