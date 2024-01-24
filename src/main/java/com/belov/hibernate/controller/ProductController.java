package com.belov.hibernate.controller;

import com.belov.hibernate.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("products/fetch-product")
    private List<String> getProductName(@RequestParam("name") String customerName) {
        return service.getProductName(customerName);
    }
}
