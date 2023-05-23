package com.shubham.ProductManagementBackend.service;

import com.shubham.ProductManagementBackend.beans.Product;
import com.shubham.ProductManagementBackend.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao pdao;


    @Override
    public List<Product> allProducts() {
        return pdao.getAllProducts();
    }

    @Override
    public Product getById(Integer pid) {
        //return pdao.findById(pid).get();
        return pdao.getProductById(pid);
    }

    @Override
    public Product insertNewProduct(Product prod) {
        return pdao.save(prod);
    }

    @Override
    public Product changeProduct(Product prod) {
        return pdao.save(prod);
    }

    @Override
    public Boolean removeProduct(Integer pid) {
        Product prod = pdao.findById(pid).get();

        if(prod != null) {
            pdao.delete(prod);
            return true;
        }
        return false;
    }


}
