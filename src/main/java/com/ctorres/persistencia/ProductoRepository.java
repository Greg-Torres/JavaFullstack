package com.ctorres.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ctorres.domain.Product;
import com.ctorres.domain.repository.ProductRepository;
import com.ctorres.persistencia.crud.ProductoCrudRepository;
import com.ctorres.persistencia.entity.Producto;
import com.ctorres.persistencia.mapper.ProductMapper;

@Repository
public class ProductoRepository implements ProductRepository {
@Autowired
	 private ProductoCrudRepository productoCrudRepository;
@Autowired
	 private ProductMapper mapper;
	 
	   public List<Product> getAll() {
	        
		   List<Producto> productos=	(List<Producto>) productoCrudRepository.findAll();
	        		return mapper.toProducts(productos);
	    }
	   
		 @Override
		    public Optional<List<Product>> getByCategory(int categoryId) {
		        List<Producto> productos = productoCrudRepository.findByidcategoriaOrderByNombreAsc(categoryId);
		        return Optional.of(mapper.toProducts(productos));
		    }
		 


		 
			@Override
			public Optional<List<Product>> getScarseProducts(int quantity) {
				   Optional<List<Producto>> productos = productoCrudRepository.findBycantidadstockLessThanAndEstado(quantity, true);
			        return productos.map(prods -> mapper.toProducts(prods));
			}
			

			@Override
			public Optional<Product> getProduct(int productId) {
				  return productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
			}
			



			@Override
			public Product save(Product product) {
				 Producto producto = mapper.toProducto(product);
			        return mapper.toProduct(productoCrudRepository.save(producto));
			}
			

			@Override
			public void delete(int productId) {
		        productoCrudRepository.deleteById(productId);
				
			}
			
	  
	   
}
