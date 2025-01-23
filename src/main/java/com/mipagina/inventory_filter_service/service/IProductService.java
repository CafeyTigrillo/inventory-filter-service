package com.mipagina.inventory_filter_service.service;

import com.mipagina.inventory_filter_service.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> searchProductsByName(String name);
}
