package it.dstech.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.dstech.model.Categoria;
import it.dstech.model.Product;
import it.dstech.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ProductService service;

	@GetMapping("/getModel")
	public Product getModel() {
		return new Product();
	}

	@PostMapping("/saveOrUpdate")
	public Product saveOrUpdate(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@GetMapping("/getAll")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}

	@GetMapping("/getById/{id}")
	public Product getById(@PathVariable("id") int id) {
		return service.getById(id);
	}

	@GetMapping("/listByCategory/{cat}")
	public List<Product> listByCategory(@PathVariable("cat") Categoria cat) {
		return service.findByCategoria(cat);
	}

}
