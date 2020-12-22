package com.ctorres.persistencia.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ctorres.persistencia.entity.Compra;

public interface CompraCrudRepository extends CrudRepository<Compra	, Integer> {

    Optional<List<Compra>> findByidcliente(String idCliente);
}
