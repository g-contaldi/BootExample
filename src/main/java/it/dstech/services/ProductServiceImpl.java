package it.dstech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.model.Categoria;
import it.dstech.model.Product;
import it.dstech.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;

	@Override
	public Product saveProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) repo.findAll();
	}

	@Override
	public Product getById(int id) {
		return repo.findOne(id);
	}

	@Override
	public List<Product> findByCategoria(Categoria categoria) {
		return repo.findByCategoria(categoria);
	}

}
