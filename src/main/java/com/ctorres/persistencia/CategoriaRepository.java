package com.ctorres.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ctorres.domain.Category;

import com.ctorres.domain.repository.CategoryRepository;
import com.ctorres.persistencia.crud.CategoriaCrudRepository;

import com.ctorres.persistencia.entity.Categoria;

import com.ctorres.persistencia.mapper.CategoryMapper;


@Repository
public class CategoriaRepository implements CategoryRepository {

	@Autowired
	 private CategoriaCrudRepository categoriaCrudRepository;
@Autowired
	 private CategoryMapper mapper;
	   
	

	@Override
	public Optional<Category> getCate(int CategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category save(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int CategoryId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		 List<Categoria> categoria=	 (List<Categoria>) categoriaCrudRepository.findAll();
 		return mapper.toCategories(categoria);
	}

}
