package com.microservicios.actividaddosmicroservicios.products.src.test.java.com.productsPackage.Products;

import org.springframework.boot.SpringApplication;

public class TestProductsApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
