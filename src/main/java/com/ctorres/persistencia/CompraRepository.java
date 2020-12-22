package com.ctorres.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ctorres.domain.Purchase;
import com.ctorres.domain.repository.PurchaseRepository;
import com.ctorres.persistencia.crud.CompraCrudRepository;
import com.ctorres.persistencia.entity.Compra;
import com.ctorres.persistencia.mapper.PurchaseMapper;

@Repository
public class CompraRepository implements PurchaseRepository{
	  @Autowired
	    private CompraCrudRepository compraCrudRepository;

	    @Autowired
	    private PurchaseMapper mapper;
	@Override
	public List<Purchase> getAll() {
		// TODO Auto-generated method stub
		  return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
	}

	@Override
	public Optional<List<Purchase>> getByClient(String clientId) {
		// TODO Auto-generated method stub
		   return compraCrudRepository.findByidcliente(clientId)
	                .map(compras -> mapper.toPurchases(compras));
	}

	@Override
	public Purchase save(Purchase purchase) {
		// TODO Auto-generated method stub
		 Compra compra = mapper.toCompra(purchase);
	        compra.getProductos().forEach(producto -> producto.setCompra(compra));

	        return mapper.toPurchase(compraCrudRepository.save(compra));
	}

}
