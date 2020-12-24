package com.ctorres.persistencia.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.ctorres.domain.Category;
import com.ctorres.domain.Product;
import com.ctorres.persistencia.entity.Categoria;
import com.ctorres.persistencia.entity.Producto;

@Mapper(componentModel = "spring",uses = {CategoryMapper.class})
public interface CategoryMapper {

	@Mappings({
        @Mapping(source = "idcategoria", target = "categoryId"),
        @Mapping(source = "descripcion", target = "category"),
        @Mapping(source = "estado", target = "active"),
})
Category toCategory(Categoria categoria);
List<Category> toCategories(List<Categoria> categorias);
@InheritInverseConfiguration
@Mapping(target = "productos", ignore = true)
Categoria toCategoria(Category category);
}
