package com.product.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.product.api.model.Product;

@SpringBootTest
class ProductRestApiApplicationTests {

	@Value("${ProductRestAPI.services.url}")
	private String baseURL;
	
	
	@Test
	void testGetProduct() {
		System.out.println(baseURL);
		RestTemplate restTemplate = new RestTemplate();
		Product prod = restTemplate.getForObject(baseURL+"4", Product.class);//working as a profile
		assertNotNull(prod);
		assertEquals("IPhone 13 Pro", prod.getName());
		
	}

	@Test
	public void testCreateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product prod = new Product();
		prod.setName("IPhone 13 Pro");
		prod.setDescription("Verry good Product");
		prod.setPrice(130965);
		Product newProd = restTemplate.postForObject(baseURL, prod, Product.class);
		assertNotNull(newProd);
		assertNotNull(newProd.getId());
		assertEquals("IPhone 13 Pro", newProd.getName());

	}

	@Test
	void testUpdateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product prodUpdate = restTemplate.getForObject(baseURL+"2", Product.class);
		prodUpdate.setPrice(90000);
		restTemplate.put("baseURL", prodUpdate);
	}

}
