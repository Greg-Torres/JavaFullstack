package com.ctorres.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctorres.domain.Product;
import com.ctorres.domain.service.ProductService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
    private ProductService productService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	   @GetMapping("/all")
	   @ApiOperation("get all myproyecto productos")
	   @ApiResponse(code=200,message = "OK")
    public ResponseEntity<List<Product>> getAll() {
        return new ResponseEntity<>(productService.getAll(),HttpStatus.OK);
    }
	
	@CrossOrigin(origins = "http://localhost:4200")  
	@GetMapping("/{id}")
	 @ApiOperation("BUSCAR UN PRODUCTO POR SU ID")
	 @ApiResponses({
		 @ApiResponse(code=200,message = "OK"),
		 @ApiResponse(code=400,message = "producto no encontrado")
	 })
	
    public ResponseEntity<Product> getProduct(@ApiParam(value="el id del producto",required = true,example="7") @PathVariable("id") int productId) {
        return productService.getProduct(productId)
        		.map(product -> new ResponseEntity<>(product,HttpStatus.OK))
    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    
    	
    
	}
	@CrossOrigin(origins = "http://localhost:4200")
	 @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Product>> getByCategory(@PathVariable("categoryId") int categoryId) {
        return productService.getByCategory(categoryId)
        		.map(products -> new ResponseEntity<>(products,HttpStatus.OK))
        		.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
	 
	@CrossOrigin(origins = "http://localhost:4200")
	 @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product),HttpStatus.CREATED);
    }
	@CrossOrigin(origins = "http://localhost:4200")
	 @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int productId) {
        if(productService.delete(productId)) {
        	return new ResponseEntity<>(HttpStatus.OK);
        }
        else {
        	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
		
    }
}
