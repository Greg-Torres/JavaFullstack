package com.ctorres.persistencia.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.ctorres.domain.Purchase;
import com.ctorres.persistencia.entity.Compra;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {

	@Mappings({
        @Mapping(source = "idcompra", target = "purchaseId"),
        @Mapping(source = "idcliente", target = "clientId"),
        @Mapping(source = "fecha", target = "date"),
        @Mapping(source = "mediopago", target = "paymentMethod"),
        @Mapping(source = "comentario", target = "comment"),
        @Mapping(source = "estado", target = "state"),
        @Mapping(source = "productos", target = "items")
})
Purchase toPurchase(Compra compra);
List<Purchase> toPurchases(List<Compra> compras);

@InheritInverseConfiguration
@Mapping(target = "cliente", ignore = true)
Compra toCompra(Purchase purchase);
}
