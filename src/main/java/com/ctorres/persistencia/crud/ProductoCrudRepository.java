package com.ctorres.persistencia.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ctorres.persistencia.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

	List<Producto> findByidcategoriaOrderByNombreAsc(int idcategoria);
	Optional<List<Producto>> findBycantidadstockLessThanAndEstado(int cantidadstock, boolean estado);
}
