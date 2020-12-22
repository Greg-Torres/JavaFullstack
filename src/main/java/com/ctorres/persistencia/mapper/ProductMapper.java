package com.ctorres.persistencia.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ctorres.domain.Product;
import com.ctorres.persistencia.entity.Producto;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

	 @Mappings({
         @Mapping(source = "idproducto", target = "productId"),
         @Mapping(source = "nombre", target = "name"),
         @Mapping(source = "idcategoria", target = "categoryId"),
         @Mapping(source = "precioventa", target = "price"),
         @Mapping(source = "cantidadstock", target = "stock"),
         @Mapping(source = "estado", target = "active"),
         @Mapping(source = "categoria", target = "category"),
 })
 Product toProduct(Producto producto);
 List<Product> toProducts(List<Producto> productos);

 @InheritInverseConfiguration
 @Mapping(target = "codigobarras", ignore = true)
 Producto toProducto(Product product);
}
