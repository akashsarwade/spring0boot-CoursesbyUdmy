package com.product.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.model.Product;
import com.product.api.repository.ProductRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

	@GetMapping("/get")
	public List<Product> getProduct() {
		LOGGER.info("finding all prodict");
		return productRepository.findAll();

	}

	@GetMapping("/get/{id}")
	@Transactional(readOnly = true)
	@Cacheable("product-cache")
	public Product getProduct(@PathVariable("id") int id) {

		LOGGER.info("finding  product by id" + id);
		return productRepository.findById(id).get();

	}

	@PostMapping("/create")
	public Product createProduct(@Valid @RequestBody Product product) {

		LOGGER.info("creating new product");
		return productRepository.save(product);
	}

	@PutMapping("/update/{id}")
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@DeleteMapping("/delete/{id}")
	@CacheEvict("product-cache")
	public void deleteProduct(@PathVariable("id") int id) {
		productRepository.deleteById(id);
	}

}
