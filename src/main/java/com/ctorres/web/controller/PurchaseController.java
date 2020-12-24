package com.ctorres.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctorres.domain.Purchase;
import com.ctorres.domain.service.PurchaseService;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

	  @Autowired
	    private PurchaseService purchaseService;
	  @CrossOrigin(origins = "http://localhost:4200")
	    @GetMapping("/all")
	    public ResponseEntity<List<Purchase>> getAll() {
	        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
	    }
	    @CrossOrigin(origins = "http://localhost:4200")
	    @GetMapping("/client/{idClient}")
	    public ResponseEntity<List<Purchase>> getByClient(@PathVariable("idClient") String clientId) {
	        return purchaseService.getByClient(clientId).map(
	                purchases -> new ResponseEntity<>(purchases, HttpStatus.OK)
	        ).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }
	    @CrossOrigin(origins = "http://localhost:4200")
	    @PostMapping("/save")
	    public ResponseEntity<Purchase> save(@RequestBody Purchase purchase) {
	        return new ResponseEntity<>(purchaseService.save(purchase), HttpStatus.CREATED);
	    }
}
