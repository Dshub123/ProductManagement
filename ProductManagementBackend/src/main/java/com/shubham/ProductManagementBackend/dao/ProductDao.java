package com.shubham.ProductManagementBackend.dao;

import com.shubham.ProductManagementBackend.beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {

    @Query("SELECT prod FROM Product prod")
    public List<Product> getAllProducts();

    @Query("SELECT prod FROM Product prod WHERE prod.productId = :pid")
    public Product getProductById(@Param("pid") Integer id);

}
