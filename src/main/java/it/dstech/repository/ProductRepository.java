package it.dstech.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.dstech.model.Categoria;
import it.dstech.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	Product findByCodice(String codice);

	List<Product> findByCategoria(Categoria categoria);

}
