package com.mipagina.inventory_filter_service.controller;

import com.mipagina.inventory_filter_service.model.Product;
import com.mipagina.inventory_filter_service.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductInventoryController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products/search")
    public List<Product> searchProductsByName(@RequestParam String name) {
        return productService.searchProductsByName(name);
    }
}
