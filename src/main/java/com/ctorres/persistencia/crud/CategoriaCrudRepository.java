package com.ctorres.persistencia.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ctorres.domain.Category;
import com.ctorres.persistencia.entity.Categoria;


public interface CategoriaCrudRepository extends CrudRepository<Categoria,Integer> {

	Optional<List<Category>> findByidcategoria(String idcategoria);
}
