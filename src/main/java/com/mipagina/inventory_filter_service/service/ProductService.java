package com.mipagina.inventory_filter_service.service;

import com.mipagina.inventory_filter_service.model.Product;
import com.mipagina.inventory_filter_service.repository.IProductInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductInventoryRepository productInventoryRepository;

    @Override
    public List<Product> searchProductsByName(String name) {
        return productInventoryRepository.findByNameContainingIgnoreCase(name);
    }
}
