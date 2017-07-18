package it.dstech.services;

import java.util.List;

import it.dstech.model.Categoria;
import it.dstech.model.Product;

public interface ProductService {

	Product saveProduct(Product product);

	List<Product> getAllProducts();

	Product getById(int id);

	List<Product> findByCategoria(Categoria categoria);

}
