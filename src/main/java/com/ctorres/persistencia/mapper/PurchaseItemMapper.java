package com.ctorres.persistencia.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.ctorres.domain.PurchaseItem;
import com.ctorres.persistencia.entity.Comprasproducto;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

	 @Mappings({
         @Mapping(source = "id.idproducto", target = "productId"),
         @Mapping(source = "cantidad", target = "quantity"),
         @Mapping(source = "estado", target = "active")
 })
 PurchaseItem toPurchaseItem(Comprasproducto producto);

 @InheritInverseConfiguration
 @Mappings({
         @Mapping(target = "compra", ignore = true),
         @Mapping(target = "producto", ignore = true),
         @Mapping(target = "id.idcompra", ignore = true)
 })
 Comprasproducto toComprasProducto(PurchaseItem item);
}
