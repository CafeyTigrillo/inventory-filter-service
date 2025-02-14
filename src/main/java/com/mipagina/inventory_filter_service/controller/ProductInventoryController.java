package com.mipagina.inventory_filter_service.controller;

import com.mipagina.inventory_filter_service.model.Product;
import com.mipagina.inventory_filter_service.service.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductInventoryController {

    @Autowired
    private IProductService productService;

    @Operation(
            summary = "Search products by name",
            description = "Returns a list of products that match the given name (case insensitive)."
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Products found successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request parameters"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping("/products/search")
    public List<Product> searchProductsByName(
            @Parameter(description = "Product name or part of it to search for", example = "Headphones", required = true)
            @RequestParam String name
    ) {
        return productService.searchProductsByName(name);
    }
}