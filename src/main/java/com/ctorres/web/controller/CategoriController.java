package com.ctorres.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctorres.domain.Category;
import com.ctorres.domain.service.CategoriaServices;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/categories")
public class CategoriController {
	@Autowired
    private CategoriaServices categoryService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	   @GetMapping("/all")
	   @ApiOperation("get all myproyecto categorias")
	   @ApiResponse(code=200,message = "OK")
public ResponseEntity<List<Category>> getAllCategorias() {
  return new ResponseEntity<>(categoryService.getAll(),HttpStatus.OK);
}
	
}
