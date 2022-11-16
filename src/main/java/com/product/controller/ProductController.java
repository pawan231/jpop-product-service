package com.product.controller;

import com.product.pojo.Product;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    

    @GetMapping
    public List<Product> getProducts(){
        return productService.getALLProduct();
    }
    
    @GetMapping("/{id}")
    public Optional<Product> getProductByID(@PathVariable("id") int id){
        return  productService.getProductById(id);
    }

  

    @PostMapping
    public Optional<Product> AddNewProduct(@RequestBody Product product){
        return Optional.ofNullable(productService.addNewProduct(product));
    }

    @PutMapping
    public Optional<Product> updateProduct(@RequestBody Product product){
        return Optional.ofNullable(productService.addNewProduct(product));
    }
    
    @DeleteMapping
    public ResponseEntity<Object> deleteProduct(@PathVariable int id){
    	productService.deleteProduct(id);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }
}
