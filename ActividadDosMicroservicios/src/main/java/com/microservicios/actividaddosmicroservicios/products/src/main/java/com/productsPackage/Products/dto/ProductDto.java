package com.microservicios.actividaddosmicroservicios.products.src.main.java.com.productsPackage.Products.dto;

public record ProductDto(
        Long id,
        String name,
        String description,
        Double price,
        Integer stock
) {
}
