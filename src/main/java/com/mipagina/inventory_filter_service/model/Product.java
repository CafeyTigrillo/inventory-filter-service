package com.mipagina.inventory_filter_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the product", example = "101")
    private Long idProduct;

    @Schema(description = "Name of the product", example = "Wireless Headphones", required = true)
    private String name;

    @Schema(description = "Detailed description of the product", example = "Noise-canceling over-ear headphones with Bluetooth 5.0", required = true)
    private String description;

    @Schema(description = "Price of the product", example = "99.99", required = true)
    private Double price;

    @Schema(description = "Unique identifier of the category to which the product belongs", example = "3", required = true)
    private Long idCategory;

    @Schema(description = "Availability status of the product", example = "true", required = true)
    private Boolean availability;


public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Product() {
    }

    public Product(Long idProduct, String name, String description, Double price, Long idCategory, Boolean availability) {
        this.idProduct = idProduct;
        this.name = name;
        this.description = description;
        this.price = price;
        this.idCategory = idCategory;
        this.availability = availability;
    }
}
