package com.ctorres.persistencia.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.ctorres.domain.Category;
import com.ctorres.persistencia.entity.Categoria;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

	@Mappings({
        @Mapping(source = "idcategoria", target = "categoryId"),
        @Mapping(source = "descripcion", target = "category"),
        @Mapping(source = "estado", target = "active"),
})
Category toCategory(Categoria categoria);

@InheritInverseConfiguration
@Mapping(target = "productos", ignore = true)
Categoria toCategoria(Category category);
}
