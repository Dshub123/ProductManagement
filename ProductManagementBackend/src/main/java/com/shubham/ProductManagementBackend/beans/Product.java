package com.shubham.ProductManagementBackend.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid")
    private Integer productId;

    @Column(name = "pname")
    private String productName;

    @Column(name = "desc")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "status")
    private String status;

    public Product(Integer productId, String productName, String description, Double price, String status) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.status = status;
    }
}
